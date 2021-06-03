package Amdocs;

import java.util.*;

/**
 * @author Bhaskar Singh
 * @date 6/2/2021 11:37 PM
 */
public class SortAndMergeTwoDiffArray {

    public static int[] mergeAndSortMethod(int[] a, int[] b) {
        SortedSet<Integer> set = new TreeSet<>();
        for(int i=0; i<a.length;i++) {
            set.add(a[i]);
            set.add(b[i]);
        }

        int c[] = new int[a.length + b.length];
        c = set.stream().mapToInt(Number::intValue).toArray();
        return c;
    }

    /*public static int[] mergeAndSortMethod(int a[], int b[]) {
        int i = 0, j = 0, k = 0;
        int[] l = new int[a.length + b.length];
        while (i < a.length && j < b.length) {
            if(a[i] < b[j]) {
                l[k] = a[i];
                ++i;
                ++k;
            } else {
                l[k] = b[j];
                ++j;
                ++k;
            }
        }
        while (i < a.length) {
            l[k] = a[i];
            ++i;
            ++k;
        }
        while (j < b.length) {
            l[k] = b[j];
            ++j;
            ++k;
        }
        return l;
    }*/

    public static void main(String[] args) {

        int a[] = new int[] {1,3,5,7,12};
        int b[] = new int[] {2,7, 9,15,17};

        int[] c = mergeAndSortMethod(a, b);

        for(int i=0; i<c.length; i++) {
            System.out.println(c[i]);
        }

    }

}
