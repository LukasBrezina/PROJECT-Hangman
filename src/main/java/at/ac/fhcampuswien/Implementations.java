package at.ac.fhcampuswien;

import java.util.*;

public class Implementations {

    // algorithm that checks if a letter was already used
    public static boolean alreadyUsedLetters(char[] usedLetters, char input) {
        boolean answer = true;
        List<Character> list = new ArrayList<>();
        for (char check : usedLetters) {
            list.add(check);
        }
        if (list.contains(input)) {
            answer = false;
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

    // this method checks if the input given is a valid input or not
    public static boolean checkValidInput(char input) {
        boolean result = false;
        List<Character> valid_inputs = new ArrayList<>();
        char[] add_valid_inputs = {'a', 'b','c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p','q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (char character : add_valid_inputs) {
            valid_inputs.add(character);
        }

        if (valid_inputs.contains(input)) {
            result = true;
        }
        return result;
    }

    // this method transforms an input to lower case, if it is upper case
    // this method is reused
    public static Character inputToLowerCase(char input) {
        String inputString = String.valueOf(input).toLowerCase();
        char[] help_for_lower_case = inputString.toCharArray();
        input = help_for_lower_case[0];
        return input;
    }
}
