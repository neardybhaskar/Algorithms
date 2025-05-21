import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * TCS
 */

public class StreamTest14 {

    public static void main(String[] args) {
        String str = "go come go there";
        List<String> list = new ArrayList<>();
        List<Object> list2 = new ArrayList<>();
        Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).forEach(System.out::println);
        list.stream().filter(e -> e.startsWith("T")).forEach(System.out::println);
        //list.stream().filter(e -> e.getLevel().equals("CMMI5")).forEach(System.out::println);
        int a = 2;
        int b = 3;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a -> "+a+" b -> "+b);
    }

}
