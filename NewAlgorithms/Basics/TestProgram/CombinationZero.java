import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class CombinationZero {

    public static void main(String[] args) {
        int a[] = new int[]{-1, 0, 1 ,2 ,-1, -4};
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(a);
        for(int i=0; i<a.length-2;i++) {
            for(int j=i+1;j<a.length-1; j++) {
                for (int k=j+1; k<a.length; k++) {
                    int sum = a[i] + a[j] + a[k];
                    if(sum == 0) {
                        result.add(Arrays.asList(a[i], a[j] , a[k]));
                    }
                }
            }
        }
        System.out.println(result);
        for(int i=0; i<a.length -1; i++) {
            if (i > 0 && a[i] == a[i - 1]) {
                continue;
            }
            int left = i + 1, right = a.length - 1;
            while (left < right) {
                int sum = a[i] + a[left] + a[right];
                if (sum == 0) {
                    result.add(Arrays.asList(a[i], a[left], a[right]));
                    while (left < right && a[left] == a[left + 1]) {
                        left++;
                    }
                    while (left < right && a[right] == a[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        System.out.println(result);
    }

}
