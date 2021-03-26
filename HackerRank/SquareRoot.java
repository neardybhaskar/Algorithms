package HackerRank;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Bhaskar on 29-01-2021
 */
public class SquareRoot {

    public static int squares(int a, int b) {
        /*int arr = (int)Math.sqrt(a);
        int brr = (int)Math.sqrt(b);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = arr; i <= brr; i++) {
            map.put(i*i, i);
        }
        int i = a;
        int count = 0;
        while (i <= b) {
            if(map.containsKey(i)) {
                ++count;
            }
            ++i;
        }
        return count;*/

        int count = 0;
        return (int)Math.floor(Math.sqrt(b)) - (int)Math.ceil(Math.sqrt(a)) + 1;
    }

    public static void main(String[] args) {
        int a = 100;
        int b = 1000;
        System.out.println(squares(a, b));

    }

}
