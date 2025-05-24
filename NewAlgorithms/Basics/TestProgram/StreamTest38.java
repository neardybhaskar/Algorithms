import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * HCL Tech
 */
public class StreamTest38 {

    public static void main(String[] args) {
        String str = "i am java developer java is interpreted language";
        Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).
                forEach((k,v) -> System.out.println(k+" "+v));
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10,11};

        System.out.println(binarySearch(array, 8));
    }

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        while(low<=high) {
            int middle = low + (high-low)/2;
            if(array[middle] == target) {
                return middle;
            }
            if(target > array[middle]) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return -1;
    }

}
