import java.util.Arrays;

/**
 * User: Sandeera Jayampathi (DS)
 * Date: 12/21/2023
 * Time: 6:21 AM
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(Factorial.factorial(10));

        int[] array = {5,10,7,1,8,3,2,6,4,9};
        BubbleSort.sort(array);
        System.out.println("");
        array = new int[]{5, 10, 7, 1, 8, 3, 2, 6, 4, 9};
        InsertionSort.sort(array);
        System.out.println("");
        array = new int[]{5, 10, 7, 1, 6, 3, 2, 8, 4, 9};
        SelectionSort.sort(array);
        System.out.println("");
    }
}
