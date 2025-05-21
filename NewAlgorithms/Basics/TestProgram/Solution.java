import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {

    public static void main(String[] args) {
        int[] arr = new int[]{9, 4, 3, 7, 7};
        solution(arr);
    }

    public static int[] solution(int[] A) {
        Map<Integer, Integer> count = new HashMap<>();
        int[] duplicate = A;
        Arrays.sort(duplicate);
        int maxElement = duplicate[duplicate.length - 1];
        System.out.println(maxElement);
        int n = A.length;
        int[] b = new int[n];
        int height = Integer.MAX_VALUE;
        for(int i=0; i<A.length; i++) {
            if(count.containsKey(A[i])) {
                
            }
        }
        for(int i=n-1; i>=0;i--) {
            b[i] = Math.min(A[i], height - 1);
            if(b[i] <= 0) {
                b[i] = 1;
                height = b[i];
            }
            System.out.print(b[i]);
        }
        return b;
    }
}