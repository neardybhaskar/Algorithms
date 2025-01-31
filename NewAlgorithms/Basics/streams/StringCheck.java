import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringCheck {

    public static String s = "ahibhichihihi";
    //print occurance of sring hi which doesn't have prefix b

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 3, 5,1, 7, 9, 2, 6);
        list.stream().skip(1).limit(6).forEach(System.out::println);
        //List<Integer> integers = list.stream().map(i -> i).max()
        String[] str = {"Java,python", "Java,python,Java","Welcome,to,Java"};
        Arrays.asList(str).stream().flatMap(e -> Arrays.stream(e.split(",")))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream()
                        .max(Map.Entry.comparingByValue()).stream().forEach(e->System.out.println(" "+e.getValue()));
        System.out.println(Arrays.stream(str).flatMap(e -> Arrays.stream(e.split(","))).filter(e -> e.equals("Java")).count());
        //Stream.of(s).map(e -> e.split(",")).flatMap(Collection::stream).collect()

        int sum = list.stream().filter(e -> e%2==0).mapToInt(e -> e * e).sum();


        int count = 0;
        for(int i=0; i<s.length() - 1; i++) {
            if(i==0) {
                if(checkString(""+s.charAt(i), ""+s.charAt(i + 1))) {
                    count++;
                }
            } else {
                if(checkString(""+s.charAt(i), ""+s.charAt(i + 1))) {
                    if(s.charAt(i - 1)+"" != "b") {
                        count++;
                    } else {
                        continue;
                    }
                }
            }
        }

    }

    public static boolean checkString(String s1, String s2 ) {
        if(s1.equals("h") && s2.equals("i")) {
            return true;
        }
        return false;
    }

}
