package at.ac.fhcampuswien;

public class Comparison {
    // Vergleich der zwei Arrays
    public static boolean AreTheSame(char[] game, char[] letters) {
        for (int i = 0; i<game.length; i++) {
            if (game[i] != letters[i]) {
                return false;
            }
        }
        return true;
    }
}
