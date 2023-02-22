import java.util.Arrays;

public class Ex7Test {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        System.out.println(Arrays.toString(switchArr(a)));
        System.out.println(Arrays.toString(evenToZero(a)));
        System.out.println(ascending(a));
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

    public static boolean ascending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }
}
