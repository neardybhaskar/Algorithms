package HackerRank;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Bhaskar on 01-02-2021
 */
public class SmallestStick {

    public static void main(String[] args) {

        /*int[] arr = {5,4,4,2,2,8};*/
        int[] arr = {1,2,3,4,3,3,2,1};
        Arrays.sort(arr);
        for(int i=1; i<arr.length;i++) {
            if(arr[i] != arr[i - 1] ) {
                System.out.println(arr.length - 1);
            }
        }

        /*List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            list.add(arr[i]);
        }
        Collections.sort(list);
        List<Integer> newlist = list.stream().distinct().collect(Collectors.toList());
        int count = 0;
        int j = 0;
        int[] arr2 = new int[newlist.size()];
        while (count != newlist.size()) {
            int value = 0;
            for(int i = 0; i<list.size(); i++) {
                if(list.get(i) != 0) {
                    if(list.get(i) - newlist.get(0) < 0) {
                        list.set(i, 0);
                        ++value;
                    } else {
                        list.set(i, list.get(i) - newlist.get(0));
                        ++value;
                    }
                }
                arr2[j] = value;
            }
            ++count;
            ++j;
        }*/

    }

}
