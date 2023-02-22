import java.util.*;
public class Opgave26 {
    public static void main(String[] args) {

        int digit, sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        while(num > 0) {
            digit = num % 10;

            sum = sum + digit;

            num = num / 10;
        }

        System.out.println("Sum of digits " + sum);

    }
}
