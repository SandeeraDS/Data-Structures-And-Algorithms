import java.util.Arrays;

/**
 * User: Sandeera Jayampathi (DS)
 * Date: 12/16/2023
 * Time: 12:21 PM
 */
public class InsertionSort {

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j > -1 && temp < array[j]) {
                array[j + 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] myArray = {5,4,6,3,1,2};
        insertionSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
