import java.util.Arrays;

/**
 * User: Sandeera Jayampathi (DS)
 * Date: 12/28/2023
 * Time: 5:25 AM
 */
public class SelectionSort {

    public static void sort(int[] array) {
        System.out.println("Before Sort : "+ Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
        System.out.println("After Selection Sort : "+ Arrays.toString(array));
    }
}
