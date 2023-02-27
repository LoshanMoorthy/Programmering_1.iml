import java.util.Arrays;

public class ArrayTest {

    static double[] t2 = new double[]{4.1, 4.3};
    public static void main(String[] args) {
        int[] a = {4, 6, 7, 2, 3};
        int[] b = {4, 6, 8, 2, 6};
        int[] c = {4, 6, 1, 2, 2};
        System.out.println("Sum of given integer array is " + sum(a));
        System.out.println("Sum of each element in 2 given arrays is " + Arrays.toString(sumArrays(a, b)));
        System.out.println("Sum of each element in 2 uneven given arrays is " + Arrays.toString(sumUnevenArrays(new int[]{1, 2, 3}, new int[]{3, 2})));
        System.out.println("Is this an uneven array? " + hasUneven(c));
    }

    public static int sum(int[] t) {
        int sum = 0;
        for (int i = 0; i < t.length; i++) {
            sum += t[i];
        }
        return sum;
    }

    public static double sumDoubleArr(double[] t) {
        double sum = 0;
        for (double v : t) {
            sum += v;
        }
        return sum;
    }

    public static int[] sumArrays(int[] a, int[] b) {
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
        }
        return c;
    }

    public static int[] sumUnevenArrays(int[] a, int[] b) {
        int[] c = new int[(int) Math.max(a.length, b.length)];
        for (int i = 0; i < c.length; i++) {
            if (a.length > i)
                c[i] += a[i];
              if (b.length > i)
                c[i] += b[i];
        }
        return c;
    }

    public static boolean hasUneven(int[] t) {
        for (int i = 0; i < t.length; i++) {
            if (t[i] % 2 != 0)
                return true;
        }
        return false;
    }
}