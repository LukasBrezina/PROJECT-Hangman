package at.ac.fhcampuswien;

import java.util.Scanner;

public class MultiOrSingle {
    public static Integer gamemode() {
        // this methode asks for the gamemode, meaning 2 is multiplayer and 1 is singleplayer
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
        return mode;
        }

    public static String singleplayer() {
        //  SINGLEPLAYER
        // if the gamemode input is 1, this method is called
        System.out.println("Only P1 was selected...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Game is starting...");
        System.out.println("A random word was generated...");
        String word = Implementations.randomWord();
        return word;
    }

    public static String[] multiplayer() {
         // MULTIPLAYER
        // if the gamemode input is 2, this method is called
        String[] word_array = new String[4];
        Scanner scanner = new Scanner(System.in);
        System.out.println("P1 & P2 was selected...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Game is starting...");
        System.out.println("P1 enter your name: ");
        String p1Name = Player.first_player_name();
        word_array[2] = p1Name;
        System.out.println("P2 enter your name: ");
        String p2Name= Player.second_player_name();
        word_array[3] = p2Name;
        System.out.println("(☞ﾟヮﾟ)☞ " + p1Name + " enter a word for " +p2Name+ " to guess.");
        String word = scanner.next();
        word_array[0] = word.toLowerCase();
        for(int i = 0; i<20;i++) {
               System.out.println();
           }
        System.out.println("(☞ﾟヮﾟ)☞ and now ... " + p2Name + " enter a word for " + p1Name + " to guess.");
        String word2 = scanner.next();
        word_array[1] = word2.toLowerCase();
        return word_array;
    }


}


