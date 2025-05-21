public class StreamTest17 {

    public static void main(String[] args) {
        //Design a class that can efficiently find the kth largest element in a stream of numbers.
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
        System.out.println(kthLargestNumber(arr, 3));

    }

    public static int kthLargestNumber(int[] arr, int k) {
        int count = 0;
        int element = 0;
        for(int i=arr.length -1; i>=0; i--) {
            count++;
            if(k==count) {
                element = arr[i];
            }
        }
        return element;
    }

}
