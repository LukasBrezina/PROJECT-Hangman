package at.ac.fhcampuswien;

import java.util.Scanner;

public class PlayTheGame {
    public static void playHangMan(String word) {
        char[] letters = word.toCharArray();
        char[] game = new char[letters.length];
        int lettercharlenght = 50; // length für usedLetters char

        // Char Array für bereits verwendete Char's
        char[] usedLetters = new char[lettercharlenght];
        for (int fillChar = 0; fillChar< lettercharlenght; fillChar++){
                usedLetters[fillChar] = ' ';
        }


        // char mit "_" befüllen
        for (int i = 0; i< letters.length; i++) {
            game[i] = '_';
        }
        Scanner scanner = new Scanner(System.in);
        int numberinArray = 0; // Array mit bereits verwendeten Char's
        int fails = 1; // Anzahl an Fehlern
        int numberForFail = 0;
        Interface.buildInterface(); // INTERFACE WIRD GEPRINTET
        System.out.println("The word has " + letters.length + " letters.");
        System.out.println("The game is only played in lower case letters!");

        // SCHLEIFE DER VERSUCHE
        for (int trys = 1; trys < 13; trys++) {
            boolean equals = Comparison.AreTheSame(game,letters); // VERGLEICH OB WORT = ARRAY
            if (equals) {
                System.out.println("The word is: " + word);
                System.out.println("YOU WIN - CONGRATULATIONS! You saved him!");
                System.out.println("( ﾉ ﾟｰﾟ)ﾉ");
                break;}
            System.out.println();
            System.out.println("Please enter a char: ");
            System.out.print("Used Letters: " );
            System.out.println(usedLetters);
            System.out.println(game);
            char input = scanner.next().charAt(0); // EINGABENABFRAGE

            // Überprüft ob Char schon mal eingegeben wurde
            while (!AlreadyUsedLetters.alreadyUsed(usedLetters, input)) {
                System.out.println("You already used this char... please enter another one.");
                input = scanner.next().charAt(0);
            }

            usedLetters[numberinArray*2] = input;

            // Schleife Überprüfung ob char in Wort enthalten
            for (int j = 0; j<letters.length;j++) {
                if (letters[j] == input) {
                    game[j] = input;
                    trys--;
                } else {
                    numberForFail++;
                    if (numberForFail == letters.length) {
                        System.out.println("The char " + input + " isn't part of the word. Fail: " + fails);
                        PrintTheHangman.printHangedMan(fails);
                        fails++;
                    }
                }
            }
            // VERLOREN, der HANGMAN hängt
            if (trys == 12) {
                System.out.println("Damn you lost... don't cry loser ... the word is: " + word);
                System.out.println("{{{(>_<)}}}");
            }
            numberForFail = 0;
            numberinArray++;
        }
    }
}
