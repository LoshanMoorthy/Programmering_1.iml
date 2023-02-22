import java.math.*;
public class Opgave3 {
    public static void main(String[] args) {
        reverse(3456);
    }

    public static void reverse(int num) {
        int reverse = 0, digit = 0;

        while(num != 0) {
             digit = num % 10;
             reverse = reverse * 10 + digit;
             num = num / 10;
        }
        System.out.println(reverse);
    }
}

