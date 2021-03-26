package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Bhaskar on 21-01-2021
 */
public class ListInteger {

    static int birthday(List<Integer> s, int d, int m) {

        int i = 0;

        int count = 0;
        int end = i+m;
        while(s.size() >= end) {
            List<Integer> a = s.subList(i, end);
            int sum = 0;
            for (Integer j: a) {
                sum += j;
            }
            if(sum == d) {
                ++count;
            }
            ++i;
            ++end;
        }
        return count;

    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        List<Integer> a = list.subList(1,3);
        System.out.println(birthday(list, 3,2));
        int sum = 0;
        for (Integer i: a) {
            sum += i;
        }
        System.out.println(sum);
    }

}
