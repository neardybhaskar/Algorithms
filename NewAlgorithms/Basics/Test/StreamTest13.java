import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Coforge L2
 */

public class StreamTest13 {

    public static void main(String[] args) {
        List<String> list = List.of("AA", "BB", "AA", "CC");
        String s = "aaavvffqqaa";
        list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().forEach(System.out::println);
        int count = 0;
        for(int i=0;i<s.length(); i++) {
            if(i+1 < s.length()) {
                if(s.charAt(i) == s.charAt(i+1)) {
                    count++;
                } else {
                    System.out.print(s.charAt(i)+""+count+" ");
                    count = 1;
                }
            }
            if(i == (s.length() - 1)) {
                count++;
                System.out.print(s.charAt(i)+""+count+" ");
            }
        }
    }

}
