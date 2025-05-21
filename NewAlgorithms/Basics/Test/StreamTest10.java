import java.util.*;

/**
 * Blooming Health
 */
public class StreamTest10 {

    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        List<int[]> result = new ArrayList<>();
        int target = 10;
        for(int num: nums) {
            int complement = target - num;
            if(nums.contains(complement)) {
                result.add(new int[] {complement, num});
                System.out.println(complement+" "+num);
            }
        }
    }

}
