package Amdocs;

/**
 * @author Bhaskar Singh
 * @date 6/5/2021 3:53 PM
 */
public class MinimumSquares {

    public static int minSquare(int a, int b) {
        if(a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        int totalSquare = 0;
        int rem = 0;

        while(b > 0) {
            totalSquare+=a/b;
            rem = a % b;
            a = b;
            b = rem;
        }
        return totalSquare;
    }

    public static void main(String[] args) {
        System.out.println(MinimumSquares.minSquare(5,18));
    }

}
