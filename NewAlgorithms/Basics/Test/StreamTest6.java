import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest6 {

    public static void main(String[] args) {
        String str = "java is very powerful language java is used by many programmers";
        Arrays.stream(str.split(" ")).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().forEach(System.out::println);
    }

}
