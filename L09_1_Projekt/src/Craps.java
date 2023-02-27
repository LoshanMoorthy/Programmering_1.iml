import java.util.*;

public class Craps {

    private static final Scanner sc = new Scanner(System.in);
    public static int die1 = 0;
    public static int die2 = 0;
    public static boolean winLose = false;

    public static void main(String[] args) {
        playCraps();
    }

    public static int sumOfTwoDice() {
        Random random = new Random();
        die1 = random.nextInt(6) + 1;
        die2 = random.nextInt(6) + 1;

        return die1 + die2;
    }

    public static void playCraps() {
        System.out.print("To play craps press [Enter]");
        sc.nextLine();
        int firstThrow = sumOfTwoDice();

        if (firstThrow == 7 || firstThrow == 11) {
            System.out.println("You rolled " + firstThrow + ". You win!");
        } else if (firstThrow == 2 || firstThrow == 3 || firstThrow == 12) {
            System.out.println("You rolled " + firstThrow + ". You lose...");
        } else {
            System.out.println("You rolled " + firstThrow + " and your point is " + firstThrow + ".");
            boolean pointRolled = rollForPoint(firstThrow);
            if (pointRolled) {
                System.out.println("You rolled your point, and you won!");
            } else {
                System.out.println("You rolled 7, which means you lost...");
            }
        }

        System.out.println("Press [Enter] to quit or write 'y' to play again");
        String input = sc.nextLine();

        if (input.equalsIgnoreCase("y")) {
            playCraps();
        }
    }

    public static boolean rollForPoint(int point) {
        System.out.print("Press [Enter] to throw again");
        sc.nextLine();
        int roll = sumOfTwoDice();

        while(point != roll && roll != 7) {
            System.out.println("You rolled " + roll + " and your point is " + point);
            System.out.println("Enter to roll again");
            sc.nextLine();
            roll = sumOfTwoDice();
        }

        return roll == point;
    }
}
