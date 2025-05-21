import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest34 {

    public static void main(String[] args) {
        String str = "bhaskar";
        //System.out.println(str.chars().mapToObj(e -> (char)e).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
        Map<Character, Integer> map = new HashMap<>();
        str.chars().mapToObj(e -> (char)e).forEach( c -> {
            map.put(c, map.getOrDefault(c, 0)+1);
        });
        System.out.println(map);
    }
}
