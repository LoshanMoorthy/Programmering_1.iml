import java.util.Arrays;
import java.util.Scanner;

public class E7_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of values: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.print("Enter the values: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        if (isConsecutiveFour(arr))
            System.out.println("The list has consecutive fours");
        else
            System.out.println("The list has no consecutive fours");
        if (isConsecutive(arr))
            System.out.println("The list has consecutive fours");
        else
            System.out.println("The list has no consecutive fours");

        System.out.println(Arrays.toString(minMax(arr)));
    }

    public static boolean isConsecutiveFour(int[] values) {
        int sameNum = 0;
        int count = 0;
        int consecutive = 4;
        for (int i = 0; i < values.length; i++) {
            sameNum = values[i];
            for (int j = i + 1; j < values.length; j++) {
                if (sameNum == values[j])
                    count++;
                else break;

                if (count >= consecutive)
                    return true;
            }
        }
        return false;
    }

    // Metode, med hurtigere kørselstid. O(n).
    public static boolean isConsecutive(int[] values) {
        int count = 0;
        int consecutive = 4;
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] == values[i + 1])
                count++;
            else
                count = 1;
            if (count == consecutive)
                return true;
        }
        return false;
    }
}
