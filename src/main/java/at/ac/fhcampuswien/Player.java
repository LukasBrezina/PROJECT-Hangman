package at.ac.fhcampuswien;
import java.util.Scanner;

public class Player {

    private String name;

    public String getName() {
        return name;
    }

    public Player(String name) {
            this.name = name;
        }

    public static String first_player_name(){
        Scanner scanner = new Scanner(System.in);
        String p1Name= scanner.next();
        Player p1 = new Player(p1Name);
        return p1.getName();
    }

    public static String second_player_name() {
        Scanner scanner = new Scanner(System.in);
        String p2Name = scanner.next();
        Player p2 = new Player(p2Name);
        return p2.getName();
    }



}
