import java.lang.Math;

public class L01 {
    public static void main(String[] args) {

        System.out.println("Opgave 1.1");
        System.out.println("Welcome to Java");
        System.out.println("Learning Java now");
        System.out.println("Programming is fun");

        System.out.println();

        System.out.println("Opgave 1.2");
        for(int i = 0; i < 4; i++) {
            System.out.println("I love Java");
        }

        System.out.println();

        System.out.println("Opgave 1.6");
        int result = 0;
        for(int i = 0; i < 10; i++) {
            result += 1 + i;
        }
        System.out.println(result);

        System.out.println();

        System.out.println("Opgave 1.7");
        System.out.println(Math.PI);

        System.out.println();

        System.out.println("Opgave 1.8");

        double radius = 6.5;

        System.out.print("Perimeter = ");
        System.out.println(2 * radius * Math.PI);
        System.out.print("Area = ");
        System.out.println(radius * radius * Math.PI);

        System.out.println();

        System.out.println("Opgave 1.9");
        System.out.print("Perimeter = ");
        System.out.println(5.3 + 8.6);
        System.out.print("Area = ");
        System.out.println(2 * (5.3 + 8.6));

    }
}
