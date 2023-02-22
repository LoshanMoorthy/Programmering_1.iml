import java.util.*;
public class Opgave2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Write any integer: ");
        int n = sc.nextInt();

        if(n == 0) {
            System.out.println("zero");
        } if(n > 0) {
            System.out.println("positive");
        } if(n < 0) {
            System.out.println("negative");
        }
    }
}