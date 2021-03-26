package HackerRank;

import java.util.*;

/**
 * @author Bhaskar on 27-01-2021
 */
public class CircularArrayRotation {

    public static void main(String[] args) {

        int k = 2;
        int[] a = {1,2};

        List<Integer> integerList = new LinkedList<>();
        integerList.add(12);
        integerList.add(14);
        integerList.add(15);
        integerList.add(16);
        integerList.add(17);

        while(k != 0) {
            integerList.add(0, integerList.get(integerList.size() - 1));
            integerList.remove(integerList.size() - 1);
            System.out.println(integerList);
            k--;
        }
        int[] finalArr = new int[a.length];
        for(int i = 0; i < a.length; i++) {
            finalArr[i] = integerList.get(a[i]);
        }
        System.out.println(finalArr[1]);

    }

}
