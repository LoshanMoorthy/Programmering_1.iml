import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(eliminateDuplicates(new int[]{1, 2, 2, 3, 3})));
    }

    public static int[] eliminateDuplicates(int[] list) {
        int newLength = list.length;
        for (int i = 1; i < list.length; i++) {
            for (int j = 0; j < i; j++) {
                if (list[i] == list[j]) { // if duplicate decrease length by 1
                    newLength--;
                    break;
                }
            }
        }

        int[] newArray = new int[newLength]; // Create new array with new length;
        newArray[0] = list[0]; // 1st element goes to new array
        int index = 1; // index for 2nd element in array
        boolean isDuplicate;

        for (int i = 1; i < list.length; i++) {
            isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (list[i] == list[j]) {
                    isDuplicate = true; // if duplicate found change boolean value to true, and break
                    break;
                }
            }
            if(!isDuplicate) { // if not duplicate, add element to new array and increase index
                newArray[index] = list[i];
                index++;
            }
        }
        return newArray;
    }
}
