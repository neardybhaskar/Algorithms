import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest2 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        //map.getOrDefault()
        String s = "Bhaskar is a java programmer";
        Set<Character> set = new HashSet<>();
        System.out.println(s.chars().mapToObj(i -> (char)i).filter(i -> !set.add(i)).findFirst().get());
        Set<Character> c = new HashSet<>();
        String str = "aabbcdde";
        System.out.println(str.chars().mapToObj(e -> (char)e).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().min(Map.Entry.comparingByValue()).stream().findFirst().get());
    }

}
