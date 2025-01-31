import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaximumSwap {

    public static int maximumSwap(int num) {
        String number = Integer.toString(num);
        String[] sArray = number.split("");
        /*int max = 0;
        int maxIndex = -1;
        Map<String, Integer> map = new HashMap<>();
        for(int i = sArray.length - 1; i >= 1; i--) {
            map.put(sArray[i], map.getOrDefault(sArray[i], 0)+1);
            int value = Integer.parseInt(sArray[i]);
            if(value > max) {
                max = value;
                maxIndex = i;
            }
        }
        int firstValue = Integer.parseInt(sArray[0]);
        if(firstValue < max) {
            if(map.get(Integer.toString(max)) == 1) {
                sArray[maxIndex] = sArray[0];
                sArray[0] = Integer.toString(max);
            }
        }
        String comb = String.join("", sArray);
        return Integer.parseInt(comb);*/
        int max = 0;
        int max_index = -1;
        int swap_1 = -1;
        int swap_2 = -1;
        for(int i = sArray.length -1; i >=0; i--) {
            if(max < Integer.parseInt(sArray[i])) {
                max = Integer.parseInt(sArray[i]);
                max_index = i;
            }
            if(max > Integer.parseInt(sArray[i])) {
                swap_1 = max_index;
                swap_2 = i;
            }
        }
        String temp = sArray[swap_1];
        sArray[swap_1] = sArray[swap_2];
        sArray[swap_2] = temp;
        String finalValue = String.join("", sArray);
        return Integer.parseInt(finalValue);
    }

    public static void main(String[] args) {
        System.out.println(maximumSwap(98368));
    }

}
