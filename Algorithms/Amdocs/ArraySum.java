package Amdocs;

/**
 * @author Bhaskar Singh
 * @date 6/5/2021 4:04 PM
 */
public class ArraySum {

    public static  int sumOfArray(int[] a) {
        int sum = 0;
        for(int i = 0; i<a.length; i++) {
            sum+=a[i];
        }
        return sum;
    }

    public static int seperateArrayDiff(int[] a) {
        int arrSum = sumOfArray(a);
        boolean even = false;
        if(arrSum % 2 == 0)
            even = true;
        return 0;
    }

    public static void main(String[] args) {

    }

}
