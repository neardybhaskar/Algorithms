import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestStream36 {

    public static void main(String[] args) {
        //int[] nums = {2,3,4,11,15};
        int[] nums = {2,3,4,11,15};
        int target = 28;
        System.out.println(Arrays.toString(threeSum(nums, target)));

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public static int[] threeSum(int[] nums, int target) {
        for(int i=0; i<nums.length - 2; i++) {
            for(int j=i+1; j<nums.length - 1; j++) {
                for(int k=i+2; k<nums.length; k++) {
                    if((nums[i] + nums[j] + nums[k]) == target) {
                        return new int[] {i,j,k};
                    }
                }
            }
        }
        return new int[] {};
    }

}
