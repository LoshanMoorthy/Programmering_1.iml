import java.util.*;
public class Opgave3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Write the first integer: ");
        int n1 = sc.nextInt();

        System.out.print("Write the second integer: ");
        int n2 = sc.nextInt();

        System.out.print("Write the third integer: ");
        int n3 = sc.nextInt();

        if(n2 > n1 && n3 > n2) {
            System.out.println("Increasing");
        } else if(n1 > n2 && n2 > n3) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither");
        }
    }
}
