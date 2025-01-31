public class FindDupicate {

    public static int findDuplicate(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n){
            int corr=nums[i]-1;
            if(nums[i]!=nums[corr] ){
                int temp=nums[i];
                nums[i]=nums[corr];
                nums[corr]=temp;
            }
            else{
                i++;
            }
        }
        return nums[n-1];
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        findDuplicate(arr);
    }

}
