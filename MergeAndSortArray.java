/**
 * @author Bhaskar on 19-01-2021
 */
public class MergeAndSortArray {

    public static int[] sortAndMerge(int a[], int b[]) {
        int[] finalArray = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if(a[i] < b[j]) {
                finalArray[k] = a[i];
                i++;
            } else {
                finalArray[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length) {
            finalArray[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            finalArray[k] = b[j];
            j++;
            k++;
        }
        return finalArray;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,8,9};
        int[] b = {2,3,7,99};
        int test[] = sortAndMerge(a, b);
        for(int i = 0; i < test.length; i++) {
            System.out.print(" "+test[i]);
        }
    }

}
