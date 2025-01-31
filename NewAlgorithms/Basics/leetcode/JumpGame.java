public class JumpGame {

    public static boolean canJump(int[] nums) {
        int finalVal = nums.length - 1;
        for(int i=nums.length - 2; i>=0; i--) {
            if(i + nums[i] >= finalVal)
                finalVal = i;
        }
        return finalVal == 0;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,1,4};
        canJump(nums);
    }

}
