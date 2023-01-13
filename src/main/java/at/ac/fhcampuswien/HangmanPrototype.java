package at.ac.fhcampuswien;


public class HangmanPrototype {

    public static void main(String[] args) {
        int gamemode_number = MultiOrSingle.gamemode();
        if (gamemode_number == 2) {
            String[] word_array = MultiOrSingle.multiplayer();
            String first_player_name = word_array[2];
            String second_player_name = word_array[3];
            PlayTheGame.playHangmanMulti(word_array, first_player_name, second_player_name);
        } else if (gamemode_number == 1) {
            String word = MultiOrSingle.singleplayer();
            PlayTheGame.playHangmanSolo(word, gamemode_number);
        }
        }
    }





