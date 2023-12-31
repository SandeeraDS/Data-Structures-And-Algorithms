import java.util.Arrays;

/**
 * User: Sandeera Jayampathi (DS)
 * Date: 12/21/2023
 * Time: 6:32 AM
 */
public class BubbleSort {

    public static void sort(int[] array) {
        System.out.println("Before Sort : "+ Arrays.toString(array));
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("After Bubble Sort : "+ Arrays.toString(array));
    }
}
