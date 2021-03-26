package HackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Bhaskar on 03-03-2021
 */
public class ACM_ICPC_Team {

    public static void main(String[] args) {

        String[] values = {"10101","11101","00010"};

        for(int i=0;i<values.length;i++) {
            int[] subject = Arrays.asList(values[i]).stream().mapToInt(Integer::parseInt).toArray();
            int flag = 0;
            Map<Integer, Integer> m = new HashMap<>();
            for(int j=0; j<subject.length; j++) {
                if(flag == 0) {
                    if(subject[j] == 0) {
                        m.put(subject[j],subject[j]);
                    }
                }
            }
        }

    }

}
