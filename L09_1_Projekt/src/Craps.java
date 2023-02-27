import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Craps {

//    public static int playerPoint = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to the game of Craps");
        printRules();
        System.out.println();

        playCraps();

        System.out.println();
        System.out.println("Thank you for playing RollTwoDice");
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Roll? ('no' stops) ");
        String answer = scanner.nextLine();
        while (!answer.equals("no")) {
            int[] faces = rollDice();
            System.out.println("Eyes: " + Arrays.toString(faces));
            System.out.println();

            int faceSum = faces[0] + faces[1];
            if (faceSum == 7 || faceSum == 12) {
                System.out.println("Congrats, you won!");
            } else if (faceSum == 2 || faceSum == 3 || faceSum == 11) {
                System.out.println("Too bad, you lost on your first throw");
            } else {
              if (rollForPoint(faceSum)) {
                  System.out.println("You won!");
              } else {
                  System.out.println("You lost...");
              }
            }
            System.out.print("Roll? ('no' stops) ");
            answer = scanner.nextLine();
        }
        scanner.close();
    }

    public static boolean rollForPoint(int point) {
        int[] faces;
        int faceSum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Roll again?");
        sc.nextLine();
        while (true) {
            faces = rollDice();
            faceSum = faces[0] + faces[1];
            System.out.println("Eyes: " + Arrays.toString(faces));
            System.out.println();
            if (faceSum == point) {
                return true;
            } else if (faceSum == 7) {
                return false;
            }
            System.out.print("Roll again? ");
            sc.nextLine();
        }
    }
}