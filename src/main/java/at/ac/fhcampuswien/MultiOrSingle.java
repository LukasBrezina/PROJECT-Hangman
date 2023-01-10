package at.ac.fhcampuswien;

import java.util.Scanner;

public class MultiOrSingle {
    public static String gamemode() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(" ___________");
        System.out.println("|           |");
        System.out.println("|  P1 & P2  |");
        System.out.println("|    OR     |");
        System.out.println("|  ONLY P1  |");
        System.out.println("|___________|");
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want to play with two players please enter '2', otherwise enter '1'.");
        int mode = scanner.nextInt();

        while (mode !=1 && mode !=2) {
            System.out.println("Your entry is invalid.");
            System.out.println("If you want to play with two players please enter '2', otherwise enter '1'.");
            mode = scanner.nextInt();
            }
        if (mode == 2) { // MULTIPLAYER
            System.out.println("P1 & P2 was selected...");
            System.out.println("...");
            System.out.println("...");
            System.out.println("Game is starting...");
            System.out.println("P1 enter your name: ");
            String p1Name = scanner.next();
            Player p1 = new Player(p1Name);
            System.out.println("P2 enter your name: ");
            String p2Name = scanner.next();
            Player p2 = new Player(p2Name);
            System.out.println("(☞ﾟヮﾟ)☞ " + p1.getName() + " enter a word for " +p2.getName()+ " to guess."); // Zweite Eingabe funktioniert noch nicht
            String word = scanner.next();
            /* for(int i = 0; i<20;i++) {
                System.out.println();
            }                               dieser Code wird später noch für eine Erweiterung des Zwei-Spieler Models hinzugefügt

            System.out.println("(☞ﾟヮﾟ)☞ and now ... " + p2.getName() + " enter a word for " + p1.getName() + " to guess.");
            String word2 = scanner.next(); */
            return word.toLowerCase();
        } else { //  SINGLEPLAYER
            System.out.println("Only P1 was selected...");
            System.out.println("...");
            System.out.println("...");
            System.out.println("Game is starting...");
            System.out.println("A random word was generated...");
            String word = WordList.randomWord();
            return word;
        }
    }
}
