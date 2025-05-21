import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest36 {

    public static void main(String[] args) {
        String str = "java is a programming language";
        str.chars().mapToObj(e -> (char)e).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).
                forEach((k,v) -> System.out.println(k+" "+v));
        str.chars().mapToObj(e -> (char)e).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).
                entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).skip(1).findFirst().get();
        System.out.println(Arrays.stream(str.split(" ")).sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
    }

}
