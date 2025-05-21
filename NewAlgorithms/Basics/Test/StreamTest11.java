import java.util.LinkedHashMap;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Barclays
 */
public class StreamTest11 {

    public static void main(String[] args) {
        String str = "bhaskar";
        System.out.println(str.chars().mapToObj(e -> (char)e).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new ,Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).findFirst().get());
    }

}
