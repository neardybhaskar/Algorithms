public class StreamTest27 {

    public static void main(String[] args) {
        /*Input: [2, 1, 5, 1, 3, 2], k=3
        Output: 9*/
        int[] arr = new int[]{2, 3, 4, 1, 5};
        int k = 2;
        System.out.println(maxContinousSum(arr, k));

    }

    public static int maxContinousSum(int[] arr, int k) {
        int maxSum = 0;
        int currentSum = 0;
        /*for(int i=0; i<arr.length; i++) {
            for(int j=i; j<i+k; j++) {
                if(j >= arr.length) {
                    continue;
                }
                currentSum += arr[j];
            }
            if(currentSum > maxSum) {
                maxSum = currentSum;
                currentSum = 0;
            }
        }*/
        //////////

        for(int i=0; i<k;i++) {
            currentSum +=arr[i];
        }
        maxSum = currentSum;
        for(int i=k;i<arr.length;i++) {
            currentSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

}
