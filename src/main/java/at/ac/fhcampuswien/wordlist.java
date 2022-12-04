package at.ac.fhcampuswien;

import java.util.Random;

public class wordlist {
    public static String randomWord() {
        String[] random = {"doctor", "professor", "detective", "confidence", "ability", "black", "book", "poker", "lukas", "mohamed",
        "amir", "billy", "campus", "return", "whiteberries", "naruto", "java", "scanner", "ibrahimovic", "ronaldo", "messi"};
        int arrayLenght = random.length;
        Random randomNumb = new Random();
        int arrayNumber = randomNumb.nextInt(arrayLenght-1); // Random String in 'random' Array ausgewaehlt
        return random[arrayNumber];
    }

}
