package HackerRank;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Bhaskar on 27-01-2021
 */
public class SequenceEquation {

    public static void main(String[] args) {
        int[] p = {5, 2, 1, 3, 4};
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<p.length; i++) {
            map.put(p[i], i+1);
        }
        int[] finalArr =  new int[p.length];
        for(int i=0; i<finalArr.length;i++) {
            int a = map.get(i+1);
            finalArr[i] = map.get(a);
            System.out.print(finalArr[i]+" ");
        }
    }

}
