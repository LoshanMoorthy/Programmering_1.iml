import java.util.Scanner;

public class E7_26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input length of list: ");
        int len = in.nextInt();

        System.out.print("Enter list: ");
        int a[] = new int[len];

        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        if (isSorted(a))
            System.out.println("The list is ascending");
        else
            System.out.println("The list is not ascending");

    }

    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1])
                return false;
        }
        return true;
    }
}