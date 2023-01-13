package at.ac.fhcampuswien;

import java.util.Random;

public class Implementations {

    // algorithm that checks if a letter was already used
    public static boolean alreadyUsedLetters(char[] usedLetters, char input) {
        boolean answer = true;
        for (int i = 0; i < usedLetters.length; i++) {
            if (usedLetters[i] == input) {
                answer = false;
            }
        }
        return answer;
    }

    // algorithm to check if the array guessed is the same as the array of
    // original given word, if yes, true is returned, otherwise false
    public static boolean wordArrayAreTheSame(char[] guess_array, char[] letters) {
        for (int i = 0; i<guess_array.length; i++) {
            if (guess_array[i] != letters[i]) {
                return false;
            }
        }
        return true;
    }

    // algorithm to choose a random word in case if mode is set 1 = singleplayer
    public static String randomWord() {
        String[] random = {"doctor", "professor", "detective", "confidence", "ability", "black", "book", "poker", "lukas", "mohamed",
                "amir", "billy", "campus", "return", "whiteberries", "naruto", "java", "scanner", "ibrahimovic", "ronaldo", "messi"};
        int arrayLenght = random.length;
        Random randomNumb = new Random();
        int arrayNumber = randomNumb.nextInt(arrayLenght-1);
        return random[arrayNumber];
    }

    // this methode builds the interface at the beginning of the game
    public static void buildInterface() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println("|                                              |");
        System.out.println("|                   HANGMAN\u00a9                   |");
        System.out.println("|                  ╰(*°▽°*)╯                   |");
        System.out.println("|                                              |");
        System.out.println("------------------------------------------------");
        System.out.println("           |      Good Luck!       |");
        System.out.println("           |      Have Fun!        |");
        System.out.println("           |    \u00bfSave the man?     |");
        System.out.println("           |_______________________|");
        System.out.println();
    }
}
