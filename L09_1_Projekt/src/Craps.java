import java.util.*;

public class Craps {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        rules();
        playCraps();
    }

    public static int sumOfTwoDice() {
        Random random = new Random();
        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;

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

    public static void rules() {
        System.out.println("Welcome to the game of Craps");
        System.out.println();
        System.out.println("========================================================================================================");
        System.out.println("The first roll is called the 'come out roll'. The player wins immediately if the first roll is a 7\n" +
                "or 11, and loses immediately if the first roll is a 2, 3 or 12. If the player's first roll is\n" +
                "4, 5, 6, 8, 9 or 10, this number is established as the player's 'point'. The player then continues to\n" +
                "throw until he either throws his 'point' again or throws a 7. If he throws a 7, he has lost. He throws\n" +
                "his 'point', he has won.");
        System.out.println("========================================================================================================");
        System.out.println();
    }
}

