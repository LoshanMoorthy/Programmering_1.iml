public class Opgave1 {

    public static void main(String[] args) {

//        Kald af metoder der afprøver opgave 1

        System.out.println(summerEven(100));
        System.out.println(summerSquare(10));
        System.out.println(sumOdd(3, 19));
        // allPowers(20);
        System.out.println(sumDigits(234));
        System.out.println(sumOddDigits(32677));

    }

    // Metoden returnerer summen af alle lige tal mellem 2 og n
    public static int summerEven(int n) {
        // TODO Opgave 1.a
        int sum = 0;
        int i = 2;
        while(i <= n) {
            if(i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        return sum;
    }

    // Metoden returnerer summen af alle kvadrater mellem 1*1 og n*n
    public static int summerSquare(int n) {
        // TODO Opgave 1.b
        int i = 0;
        int sum = 0;
        while(i <= n) {
            sum = sum + i*i;
            i++;
        }
        return sum;
    }

    // Metoden returnerer summen af alle ulige tal mellem a og b
    public static int sumOdd(int a, int b) {
        // TODO Opgave 1.c
        int sum = 0;
        while (a <= b) {
            if(a % 2 != 0) {
                sum += a;
            }
            a++;
        }
        return sum;
    }

    // Metoden udskriver 2 potenser fra
    public static void allPowers(int n) {
        // TODO Opgave 1.d
        int i = 0;
        int sum = 1;
        while(i < n) {
            i++;
            sum  = sum * 2;
            System.out.println(sum);
        }
    }

    public static int sumDigits(int n) {
        int digit, sum = 0;

        while (n > 0) {
            digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        return sum;
    }

    public static int sumOddDigits(int n) {
        int digit = 0, sum = 0;

        while(n > 0) {
            digit = n % 10;
            if(digit % 2 != 0) {
                sum += digit;
            }
            n = n / 10;
        }
        return sum;
    }
}
