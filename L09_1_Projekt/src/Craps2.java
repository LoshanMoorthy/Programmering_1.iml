import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Craps2 {

    public static int firstRoll;

    public static void main(String[] args) {
        System.out.println("Welcome to the game of Craps");
        printRules();
        System.out.println();

        playCraps();

        System.out.println();
        System.out.println("Thank you for playing Craps");
    }

    private static void printRules() {
        System.out.println("=====================================================");
        System.out.println("Rules of craps:");
        System.out.println("The first roll is called the 'come out roll'. The player wins immediately if the first roll is a 7\n" +
                "or 11, and loses immediately if the first roll is a 2, 3 or 12. If the player's first roll is\n" +
                "4, 5, 6, 8, 9 or 10, this number is established as the player's 'point'. The player then continues to\n" +
                "throw until he either throws his 'point' again or throws a 7. If he throws a 7, he has lost. He throws\n" +
                "his 'point', he has won.");
        System.out.println("=====================================================");
    }

    private static int[] rollDice() {
        int[] dice = new int[2];
        Random random = new Random();
        for (int i = 0; i < dice.length; i++) {
            dice[i] = random.nextInt(6) + 1;
        }
        return dice;
    }

    private static void playCraps() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you wanna roll your come out roll ('no' stops)");
        String answer = sc.nextLine();
        while (!answer.equals("no")) {
            int[] faces = rollDice();
            System.out.println("Eyes: " + Arrays.toString(faces));
            firstRoll = faces[0] + faces[1];
            System.out.println("Your come out roll is " + firstRoll);

            if (firstRoll == 7 || firstRoll == 12) {
                System.out.println("Too bad, you lost on your first throw...");
            } else if (firstRoll == 2 || firstRoll == 3 || firstRoll == 11) {
                System.out.println("You won on your first throw!!");
            }
            System.out.print("Do you wanna play again?");
            answer = sc.nextLine();
        }
        sc.close();
    }

    public static boolean rollForPoint(int point) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Roll again? Your come out roll is " + firstRoll);
        System.out.println("If you throw your come out roll you will win, if you throw 7 you will loose");
        while (firstRoll != point || firstRoll != 7) {
            int[] faces = rollDice();
            int faceSum = faces[0] + faces[1];
            System.out.println("Eyes: " + Arrays.toString(faces));
        }
    }
}
