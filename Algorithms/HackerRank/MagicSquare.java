package HackerRank;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Bhaskar on 21-01-2021
 */
public class MagicSquare {

    public static int change(int[][] a) {
        int[][][] p = {{{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
                {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
                {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
                {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
                {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
                {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
                {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
                {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}}};
        int min = 100;
        for(int i=0; i<8;i++) {
            int diff = 0;
            for(int j=0; j<3;j++) {
                for(int k=0; k<3; k++) {
                    diff += Math.abs(p[i][j][k] - a[j][k]);
                }
            }
            if(diff < min) {
                min = diff;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int s[][] = {{4, 9, 2}, {3, 5, 7}, {8, 1, 5}};
        /*int[] a = new int[9];
        int[] b = {1,2,3,4,5,6,7,8,9};
        int k = 0;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
                a[k] = s[i][j];
                k++;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.equals(a,b);*/

        int[] b = {1,2,3,4,5,6,7,8,9};
        int[] c = {1,2,3,4,5,6,6,8,9};
        change(s);
    }

}
