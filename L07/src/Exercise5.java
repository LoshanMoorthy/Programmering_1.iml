import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        // System.out.println("The number of even numbers " + countEvenArr(new int[]{1, 2, 3, 4}));
        // System.out.println("The number of odd numbers " + countOddArr(new int[]{1, 2, 3, 4}));

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[50];
        int[] count = new int[50];
        int temp = 0;

        System.out.println("Enter integers between 50 and end with 0: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0)
                break;
        }
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            count[temp]++;
        }
        for (int i = 1; i < count.length; i++) {
            if (count[i] == 1)
                System.out.println(count[i] + " occurs " + i + " times");
            else if (count[i] >= 2)
                System.out.println(count[i] + " occurs " + i + " times");
        }
    }

    public static int countEvenArr(int[] arr) {
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                even++;
        }
        return even;
    }

    public static int countOddArr(int[] arr) {
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                odd++;
        }
        return odd;
    }

/*    public static void countElements(int[] arr) {

    }*/
}
