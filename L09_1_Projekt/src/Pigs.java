import java.util.Random;
import java.util.Scanner;

public class Pigs {

    private static final Scanner sc = new Scanner(System.in);
    private static int player1;
    private static int player2;
    private static int pointsToWin;
    private static String player1Name;
    private static String player2Name;
    private static int[] player1Rolls;
    private static int[] player2Rolls;
    private static int count;

    public static void main(String[] args) {
        rules();
        playPigs();
    }

    public static void playPigs() {
        System.out.print("To play pigs press [Enter]");
        sc.nextLine();

        pickNames();
        winningPoint();

        boolean whosTurn = true;
        boolean winnerFound = false;

        while (!winnerFound) {
            if (whosTurn) {
                player1 = rollForPoint(player1Name, player1);
                if (player1 >= pointsToWin) {
                    System.out.println(player1Name + " won");
                    winnerFound = true;
                }
            } else {
                player2 = rollForPoint(player2Name, player2);
                if (player2 >= pointsToWin) {
                    System.out.println(player2Name + " won");
                    winnerFound = true;
                }
            }
            whosTurn = !whosTurn;
        }
        System.out.println("Press [Enter] to quit or write 'y' to play again");
        String input = sc.nextLine();
        if (input.equalsIgnoreCase("y")) {
            playPigs();
        }
    }

    public static int rollForPoint(String name, int points) {
        System.out.println();
        System.out.println("It's " + name + " turn");
        System.out.println("Press [Enter] or write 'skip' if you wanna skip");
        String answer = sc.nextLine();
        int pointsForThisRound = 0;
        int[] eyes;
        int eyeSum = 0;
        while (!answer.equalsIgnoreCase("skip")) {
            eyes = sumOfOneDie();
            eyeSum = eyes[0] + eyes[1];
            pointsForThisRound += eyeSum;
            if (eyes[0] == 1 && eyes[1] == 1) {
                System.out.println(name + " rolled 1 which means " + name + " didnt get any points for this round");
                return 0;
            }
            else if (eyes[0] == 1 || eyes[1] == 1) {
                System.out.println(name + " rolled 1 which means " + name + " didnt get any points for this round");
                return points;
            } else if (points + pointsForThisRound >= pointsToWin) {
                System.out.println(name + " rolled a " + eyeSum);
                return points + pointsForThisRound;
            } else {
                System.out.println(name + " rolled a " + eyeSum);
                System.out.println("Press [Enter] or write 'skip' if you wanna skip");
                answer = sc.nextLine();
            }
        }
        return pointsForThisRound;
    }

    public static int[] sumOfOneDie() {
        int[] dice = new int[2];
        Random random = new Random();
        for (int i = 0; i < dice.length; i++) {
            dice[i] = random.nextInt(6) + 1;
        }
        return dice;
    }

    public static void winningPoint() {
        System.out.println("Choose how many points you wanna play to");
        int decision = sc.nextInt();
        sc.nextLine();
        if (decision > 0) {
            pointsToWin = decision;
        } else {
            System.out.println("It has to be bigger than zero");
            winningPoint();
        }
        player1Rolls = new int[pointsToWin * 4];
        player2Rolls = new int[pointsToWin * 4];
    }

    public static void pickNames() {
        System.out.println("Player1: Choose your name");
        player1Name = sc.next();
        System.out.println("Player2: Choose your name");
        player2Name = sc.next();
    }

    public static void updateStatistics() {

    }

    public static void printStatistics() {
            System.out.println("\nResults:");
            System.out.println("-------");
            System.out.printf("%17s %4s\n", "Roll average pr. round for:", player1Name);
            System.out.printf("%17s %4s\n", "Roll average pr. round for:", player2Name);
    }


    public static void rules() {
        System.out.println("Welcome to the game of Pigs");
        System.out.println();
        System.out.println("========================================================================================================");
        System.out.println("Første spiller kaster en terning, indtil han enten kaster 1, eller beslutter sig for at stoppe. Hvis han \n" +
                "slår en 1’er, får han ingen point i denne runde. Hvis han beslutter sig for at stoppe, inden har slår \n" +
                "en 1’er, lægges summen af alle hans kast i denne runde sammen med hans samlede antal point, \n" +
                "og turen går videre til næste spiller. Derefter skiftes spillerne til at kaste. Den første spiller, der \n" +
                "samlet når 100 point, har vundet.");
        System.out.println("========================================================================================================");
        System.out.println();
    }
}
