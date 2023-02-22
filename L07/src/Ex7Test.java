import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class Ex7Test {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        System.out.println(Arrays.toString(switchArr(a)));
        System.out.println(Arrays.toString(evenToZero(a)));
        System.out.println(ascending(a));
        System.out.println(findSecondLargestElement(a));
        System.out.println(Arrays.toString(rotateRight(a)));
        System.out.println(checkDoublets(a));
    }

    public static int[] switchArr(int[] arr) {
        if (arr != null && arr.length > 1) {
            int x = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = x;
        }
        return arr;
    }

    public static int[] evenToZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = 0;
            }
        }
        return arr;
    }

    public static int findSecondLargestElement(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    public static boolean ascending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }

    public static int[] rotateRight(int[] arr) {
        int n = 1;
        for (int i = 0; i < n; i++) {
            int j, last;

            last = arr[arr.length - 1];

            for (j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        return arr;
    }

    public static boolean checkDoublets(int[] arr) {
        int comp = 0;
        for (int i = 0; i < arr.length; i++) {
            comp = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (comp == arr[j])
                    return true;
            }
        }
        return false;
    }
}
