package at.ac.fhcampuswien;

public class PrintTheHangman
{
    public static void printHangman(int wrongCount)
    {

        switch (wrongCount)
        {
            case 1:
                System.out.println("    ____");
                System.out.println("   |    |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("___|___");
                break;
            case 2:
                System.out.println("    ____");
                System.out.println("   |    |");
                System.out.println("   |    O");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("___|___");
                break;
            case 3:
                System.out.println("    ____");
                System.out.println("   |    |");
                System.out.println("   |    O");
                System.out.println("   |    |");
                System.out.println("   |    |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("___|___");
                break;
            case 4:
                System.out.println("    ____");
                System.out.println("   |    |");
                System.out.println("   |    O");
                System.out.println("   |   /|");
                System.out.println("   |    |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("___|___");
                break;
            case 5:
                System.out.println("    ____");
                System.out.println("   |    |");
                System.out.println("   |    O");
                System.out.println("   |   /|\\");
                System.out.println("   |    |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("___|___");
                break;
            case 6:
                System.out.println("    ____");
                System.out.println("   |    |");
                System.out.println("   |    O");
                System.out.println("   |   /|\\");
                System.out.println("   |    |");
                System.out.println("   |   /");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("___|___");
                break;
            case 7:
                System.out.println("    ____");
                System.out.println("   |    |");
                System.out.println("   |    O");
                System.out.println("   |   /|\\");
                System.out.println("   |    |");
                System.out.println("   |   / \\");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("___|___");
                break;
            case 8:
                System.out.println("    ____");
                System.out.println("   |    |");
                System.out.println("   |    O");
                System.out.println("   |   /|\\");
                System.out.println("   |    |");
                System.out.println("   |   / \\");
                System.out.println("   |   /");
                System.out.println("   |");
                System.out.println("___|___");
                break;
            case 9:
                System.out.println("    ____");
                System.out.println("   |    |");
                System.out.println("   |    O");
                System.out.println("   |   /|\\");
                System.out.println("   |    |");
                System.out.println("   |   / \\");
                System.out.println("   |   / \\");
                System.out.println("   |");
                System.out.println("___|___");
                break;
            case 10:
                System.out.println("    ____");
                System.out.println("   |    |");
                System.out.println("   |    O");
                System.out.println("   |   /|\\");
                System.out.println("   |    |");
                System.out.println("   |   / \\");
                System.out.println("   |  /   \\");
                System.out.println("   |");
                System.out.println("___|___");
                break;
            case 11:
                System.out.println("    ____");
                System.out.println("   |    |");
                System.out.println("   |    O");
                System.out.println("   |   /|\\");
                System.out.println("   |    |");
                System.out.println("   |   / \\");
                System.out.println("   |  /   \\");
                System.out.println("   |");
                System.out.println("___|___");
                break;
            case 12:
                System.out.println("    ____");
                System.out.println("   |    |");
                System.out.println("   |    O");
                System.out.println("   |   /|\\");
                System.out.println("   |    |");
                System.out.println("   |   / \\");
                System.out.println("   |  /   \\");
                System.out.println("   |");
                System.out.println("___|___");
                System.out.println("You lose!");
                break;
        }
    }
}





//     _________
//     | /     |
//     |/      O
//     |      \|/
//     |       |
//     |      / \
//    / \