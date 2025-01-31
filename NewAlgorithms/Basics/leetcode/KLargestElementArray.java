import java.util.PriorityQueue;

public class KLargestElementArray {

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> kNumbersMinHeap = new PriorityQueue<Integer>();
        for (int i=0;i<k;i++) {
            kNumbersMinHeap.add(nums[i]);
        }
        for(int i=k; i<nums.length;i++) {
            if(nums[i] > kNumbersMinHeap.peek()) {
                kNumbersMinHeap.poll();
                kNumbersMinHeap.add(nums[i]);
            }
        }
        return kNumbersMinHeap.peek();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,3,1,2,4,5,5,6};
        int k=4;
        System.out.println(findKthLargest(arr, k));
    }

}
