public class SingleNumber {

    public static int singleNumber(int[] nums) {
        return check(0,nums);
    }
    public static int check(int k,int [] nums){
        if(k==nums.length){
            return 0;
        }
        return nums[k]^check(k+1,nums);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1};
        singleNumber(nums);
    }

}
