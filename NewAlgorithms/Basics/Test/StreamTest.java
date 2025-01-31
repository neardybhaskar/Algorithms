import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
        String str = "This is java code This is java code java";
        String[] strArr = str.split(" ");
        Map<String, Integer> map = new HashMap<>();
        //Stream.of(strArr).map(s -> map.put(s, map.getOrDefault(s, 0)+1)).sorted(Comparator.reverseOrder()).findFirst();
        String[] strInt = {"1","2","3","5","6","7","9"};
        System.out.println("Test");
/*        int[] i = new int[]

                {1,2,3,4,5,6,7,8,9};
        String
        Stream.of(strInt).forEach(s -> s != );*/
        int[] integer = new int[]{1,2,3,5,6,7,9};
        int i = 1;
        //Stream.of(integer).forEach(element -> element.equals(i) ? System.out.println(i++):i++);

    }

}
