package at.ac.fhcampuswien;

import java.util.Scanner;

public class PlayTheGame {
    public static Integer playHangmanSolo(String word, int mode) {
        char[] letters = word.toCharArray();
        char[] game = new char[letters.length];
        // length for usedLetters char
        int lettercharlenght = 50;

        // this char array is filled up with the chars which where already used
        char[] usedLetters = new char[lettercharlenght];
        for (int fillChar = 0; fillChar< lettercharlenght; fillChar++){
                usedLetters[fillChar] = ' ';
        }


        // filling the empty char, which is the same length as the word given,
        // with "_" chars
        for (int i = 0; i< letters.length; i++) {
            game[i] = '_';
        }
        Scanner scanner = new Scanner(System.in);
        // array with already used chars
        int numberinArray = 0;
        // number of fails = wrong guesses
        int fails = 0;
        int numberForFail = 0;
        // print of the inferface
        Interface.buildInterface();
        System.out.println("The word has " + letters.length + " letters.");
        System.out.println("The game is only played in lower case letters!");

        // loop for the number of trys you have
        for (int trys = 1; trys < 13; trys++) {
            // comparison of char array and word, if they are the same -> you won the game
            boolean equals = Comparison.AreTheSame(game,letters);
            if (equals) {
                System.out.println("The word is: " + word);
                System.out.println("YOU WIN - CONGRATULATIONS! You saved him!");
                if (mode == 2) {
                    System.out.println("This is your number of fails: " + fails);
                    System.out.println("The Player with less fails wins the game!");
                }
                System.out.println("( ﾉ ﾟｰﾟ)ﾉ");
                break;}
            System.out.println();
            System.out.println("Please enter a char: ");
            System.out.print("Used Letters: " );
            System.out.println(usedLetters);
            System.out.println(game);

            // In these lines the scanner asks for an char input, which is then
            // with the help of a string & char array converted to lowercase
            char input = scanner.next().charAt(0);
            String inputString = String.valueOf(input).toLowerCase();
            char[] help_for_lower_case = inputString.toCharArray();
            input = help_for_lower_case[0];

            // checks if an char was already used and if yes, it asks for another input
            while (!AlreadyUsedLetters.alreadyUsed(usedLetters, input)) {
                System.out.println("You already used this char... please enter another one.");
                input = scanner.next().charAt(0);
            }

            // only every second index of the array is filled up with the input
            // due to formatting reasons
            usedLetters[numberinArray*2] = input;

            // loop that checks if an char input occurs in the word given, either random generated
            // or chosen by your opponent
            for (int j = 0; j<letters.length;j++) {
                if (letters[j] == input) {
                    game[j] = input;
                    trys--;
                } else {
                    numberForFail++;
                    if (numberForFail == letters.length) {
                        fails++;
                        System.out.println("The char " + input + " isn't part of the word. Fail: " + fails);
                        PrintTheHangman.printHangedMan(fails);
                    }
                }
            }
            // these lines happen when your try counter reaches 12, which means
            // that the hangman is completely build up -> you lost
            if (trys == 12) {
                System.out.println("Damn you lost... don't cry loser ... the word is: " + word);
                System.out.println("{{{(>_<)}}}");
            }
            numberForFail = 0;
            numberinArray++;
        }
        return fails;
    }

    public static void playHangmanMulti(String[] multi_words, String p1Name, String p2Name) {

        // game call when the gamemode is selected as "2" meaning multiplayer mode
        // the player with less fails wins the game
        String first_word = multi_words[0];
        String second_word = multi_words[1];
        int first_player_fails = playHangmanSolo(first_word, 2);
        int second_player_fails = playHangmanSolo(second_word, 2);
        if (first_player_fails > second_player_fails) {
            System.out.println(p2Name + " you have less fails than " + p1Name + " so you won the game, CONGRATULATIONS!");
        } else if (second_player_fails > first_player_fails) {
            System.out.println(p1Name + " you have less fails than " + p2Name + " so you won the game, CONGRATULATIONS!");
        } else {
            System.out.println("Its a draw! You both have the same number of fails!");
        }

    }
}
