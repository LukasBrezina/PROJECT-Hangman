package at.ac.fhcampuswien;

import java.util.Random;

public class WordList {
    public static String randomWord() {
        String[] random = {"doctor", "professor", "detective", "confidence", "ability", "black", "book", "poker", "lukas", "mohamed",
        "amir", "billy", "campus", "return", "whiteberries", "naruto", "java", "scanner", "ibrahimovic", "ronaldo", "messi"};
        int arrayLenght = random.length;
        Random randomNumb = new Random();
        int arrayNumber = randomNumb.nextInt(arrayLenght-1); // Random String in 'random' Array ausgewaehlt
        return random[arrayNumber];
    }
    // Wordlist Klasse wird durch eine Textdatei ersetzt, welche eine weitaus größere Anzahl an Worten beinhaltet, welche wir dann importen
    // und ein Wort mithilfe von Random zufällig ausgewählt wird
}
