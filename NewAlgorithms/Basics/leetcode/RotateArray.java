import java.util.Arrays;
import java.util.List;

public class RotateArray {

    public static void rotate(int[] nums, int k) {
        List<Integer> newNums = Arrays.stream(nums).boxed().toList();
        int index = 0;
        for(int i=(newNums.size() - (k));i<newNums.size();i++) {
            nums[index++] = newNums.get(i);
        }
        for(int i=0;i<newNums.size()-k;i++) {
            nums[index++] = newNums.get(i);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        rotate(nums, 3);
    }

}
