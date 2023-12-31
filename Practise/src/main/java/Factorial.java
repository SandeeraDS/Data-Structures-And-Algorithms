/**
 * User: Sandeera Jayampathi (DS)
 * Date: 12/21/2023
 * Time: 6:22 AM
 */
public class Factorial {


    public static long factorial(int x) {
        if (x == 1) {
            return 1;
        }
        return x * factorial(x - 1);
    }
}
