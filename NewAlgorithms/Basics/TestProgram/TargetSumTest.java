import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TargetSumTest {

    public static void main(String[] args) {
        /*int [] a = {1,4,-1,6};
        int target = 5;

        //O/p : (1,4) (-1,6)
        Map<Integer, Integer> map = new HashMap<>();
        List<int[]> list = new ArrayList<>();
        for(int i=0; i<a.length; i++) {
            int complement = target - a[i];
            if(map.containsKey(complement)) {
                list.add(new int[]{a[i], complement});
                continue;
            }
            map.put(a[i], i);
        }
        list.stream().forEach(e -> System.out.println(Arrays.toString(e)));*/


        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        //System.out.println(myList.stream().max(Integer::compare).get());
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        names.stream().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).
                forEach((k,v) -> System.out.println(k+" "+v));

    }

    //select max(salary) from employee limit 1 offset 1



}
