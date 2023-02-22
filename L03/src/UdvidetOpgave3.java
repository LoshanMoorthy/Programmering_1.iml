import java.util.Scanner;

public class UdvidetOpgave3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Write the first integer: ");
        int n1 = sc.nextInt();

        System.out.print("Write the second integer: ");
        int n2 = sc.nextInt();

        System.out.print("Write the third integer: ");
        int n3 = sc.nextInt();

        System.out.println("The three integers is in " + inorder(n1, n2, n3) + " order");
    }

    public static String inorder(int n1, int n2, int n3) {
        if(n2 > n1 && n3 > n2) {
            return "Increasing";
        } else if(n1 > n2 && n2 > n3) {
            return "Decreasing";
        }
        return "Neither";
    }
}