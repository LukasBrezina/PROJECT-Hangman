package at.ac.fhcampuswien;


public class HangmanPrototype {

    public static void main(String[] args) {
        int gamemode_number = MultiOrSingle.Gamemode();
        if (gamemode_number == 2) {
            String[] multi_words = MultiOrSingle.Multiplayer();
            String first_player_name = multi_words[2];
            String second_player_name = multi_words[3];
            PlayTheGame.playHangmanMulti(multi_words, first_player_name, second_player_name);
        } else if (gamemode_number == 1) {
            String word = MultiOrSingle.Singleplayer();
            PlayTheGame.playHangmanSolo(word, gamemode_number);
        }
        }
    }





