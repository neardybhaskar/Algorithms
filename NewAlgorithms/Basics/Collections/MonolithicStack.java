public class MonolithicStack {

    public static boolean isMonotonic(int[] nums) {
        int diff = 0;
        if(isGreater(nums) == -1) {
            diff = 0;
        } else if(isGreater(nums) == 1) {
            diff = 1;
        } else {
            diff = -1;
        }
        for (int i=0; i<nums.length; i++) {
            if((i < nums.length - 1)) {
                if((nums[i] - nums[i+1]) != diff && (nums[i] - nums[i+1]) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int isGreater(int[] nums) {
        if(nums[0] > nums[nums.length-1]) {
            return 1;
        } else if (nums[0] < nums[nums.length-1]) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,2};
        System.out.println(MonolithicStack.isMonotonic(nums));
    }

}
