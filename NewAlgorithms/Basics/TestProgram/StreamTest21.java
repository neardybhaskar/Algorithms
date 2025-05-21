import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StreamTest21 {

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int[] sumArr = new int[arr.length];
        int sum = 9;
        int sumArrIndex = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++) {
            if(arr[i] > sum) {
                continue;
            }
            map.put(Math.abs(arr[i]), i);
        }
        for(int i=0; i<arr.length;i++) {
            if(arr[i] > sum) {
                continue;
            }
            if(map.containsKey(Math.abs(sum - arr[i]))) {
                sumArr[sumArrIndex++] = i; //0 //1
                sumArr[sumArrIndex] = map.get(Math.abs(arr[i]-sum));
                break;
            }
        }
        for(int i=0; i<sumArr.length; i++) {
            System.out.println(sumArr[i]);
        }
    }

}
