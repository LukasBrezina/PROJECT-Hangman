package at.ac.fhcampuswien;

public class alreadyUsedLetters {

    public static boolean alreadyUsed(char[] usedLetters, char input) {
        boolean answer = true;
        for (int i = 0; i < usedLetters.length; i++) {
            if (usedLetters[i] == input) {
                answer = false;
            }
        }
        return answer;
    }
}
