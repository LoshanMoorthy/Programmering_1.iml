import java.util.Scanner;

public class UdvidetOpgave2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Write an integer: ");
        int n = sc.nextInt();

        System.out.println(sign(n));
    }

    public static String sign(int n) {
        if(n == 0) {
            return "zero";
        } else if(n > 0) {
            return "positive";
        }
        return "negative";
    }
}