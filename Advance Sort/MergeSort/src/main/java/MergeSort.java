import java.util.Arrays;

/**
 * User: Sandeera Jayampathi (DS)
 * Date: 12/17/2023
 * Time: 5:00 AM
 */
public class MergeSort {

    public static int[] merge(int[] array1, int[] array2) {
        int[] combined = new int[array1.length + array2.length];
        int index = 0;
        int i = 0;
        int j = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                combined[index] = array1[i];
                index++;
                i++;
            } else {
                combined[index] = array2[j];
                index++;
                j++;
            }
        }
        while (i < array1.length) {
            combined[index] = array1[i];
            index++;
            i++;
        }
        while (j < array2.length) {
            combined[index] = array2[j];
            index++;
            j++;
        }
        return combined;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 3, 7, 8};
        int[] array2 = {2, 4, 5, 6};
        System.out.println(Arrays.toString(merge(array1, array2)));
        int[] array = {2, 8, 5, 7, 3, 1, 4, 9,6};
        System.out.println(Arrays.toString(mergeSort(array)));
    }

    public static int[] mergeSort(int[] array) {
        if (array.length == 1) return array;
        int midIndex = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, midIndex);
        int[] right = Arrays.copyOfRange(array, midIndex, array.length);
        return merge(mergeSort(left), mergeSort(right));
    }


}
