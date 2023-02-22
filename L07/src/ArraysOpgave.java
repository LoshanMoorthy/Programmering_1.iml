import java.util.Arrays;

public class ArraysOpgave {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        System.out.println(Arrays.toString(array1));

        int[] array2 = {2, 44, -23, 99, 8, -5, 7, 10, 20, 30};
        System.out.println(Arrays.toString(array2));

        int[] array3 = new int[10];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = i;
        }
        System.out.println(Arrays.toString(array3));

        int[] array4 = new int[10];
        for (int i = 0; i < 10; i++) {
            array4[i] = 2 * (i + 1);
        }
        System.out.println(Arrays.toString(array4));

        int[] array5 = new int[10];
        int sum = 0;
        int unEven = 1;
        for (int i = 0; i < array5.length; i++) {
            sum += unEven;
            unEven += 2;
            array5[i] = sum;
        }
        System.out.println(Arrays.toString(array5));

        int[] array6 = new int[10];
        int n1 = 0;
        int n2 = 1;
        for (int i = 0; i < array6.length; i++) {
            if(i % 2 == 0) {
                array6[i] = n1;
            } else {
                array6[i] = n2;
            }
        }
        System.out.println(Arrays.toString(array6));
    }
}