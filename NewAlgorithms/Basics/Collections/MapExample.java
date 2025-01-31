package Basics.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int[] test() {
        int[] a = {1,2};
        return a;
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] output = null;
        for(int i = 0; i<nums.length; i++) {
            if( nums[i]>target) {
                continue;
            }
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    output = new int[]{i, j};
                    return output;
                }
            }
        }
        return output;
    }
    public static void main(String[] args) {
        /*Map<String, Integer> elementMap = new HashMap<>();
        elementMap.put("a", 1);
        elementMap.put("a", 1);
        elementMap.put("b", 1);
        elementMap.put("c", 1);
        elementMap.put("d", 1);
        elementMap.put("e", 1);
        elementMap.put("f", 1);
        elementMap.put("g", 1);
        for (Map.Entry<String, Integer> entries: elementMap.entrySet()) {
            elementMap.put(entries.getKey(), elementMap.getOrDefault(entries.getKey(), 0)+1);
        }*/

        System.out.println(MapExample.twoSum(new int[]{-1,-2,-3,-4,-5}, 0));

    }

}
