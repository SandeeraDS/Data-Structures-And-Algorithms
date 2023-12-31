import java.util.Arrays;

/**
 * User: Sandeera Jayampathi (DS)
 * Date: 12/27/2023
 * Time: 5:48 AM
 */
public class InsertionSort {
// array = new int[]{1, 5, 7, 10, 8, 3, 2, 6, 4, 9};
    public static void sort(int[] array) {
        System.out.println("Before Sort : "+ Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];//1
            int j = i - 1;//2
            while (j > -1 && temp < array[j]) { //0
                array[j + 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
        System.out.println("After Insertion Sort : "+ Arrays.toString(array));
    }
}
