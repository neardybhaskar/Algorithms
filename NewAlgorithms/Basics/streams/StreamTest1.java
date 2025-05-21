import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Netcracker

public class StreamTest1 {

    public static void main(String[] args) {

        String[] str = {"Java, python", "Java, python, Java", "Welcome, to ,Java"};
        Arrays.stream(str).flatMap(e -> Arrays.stream(e.split(","))).filter(e -> e.equals("java")).count();

        System.out.println(Arrays.stream(str).flatMap(e -> Arrays.stream(e.split(","))).filter(e -> e.contains("Java")).count());

        int sum = Stream.iterate(new int[]{0,1}, x -> new int[] {x[1], x[0] + x[1]})
                .limit(7).map(x -> x[0]).collect(Collectors.toList()).stream()
                .distinct().filter(i -> i % 2 == 0) .mapToInt(i -> i).sum();
        int sum2 = Stream.iterate(new int[]{0,1}, x -> new int[] {x[1], x[0] + x[1]})
                .limit(8).map(x -> x[0]).collect(Collectors.toList()).stream()
                .distinct().filter(i -> i % 2 == 0) .mapToInt(i -> i).sum();
        System.out.println("Sum "+sum+" : "+sum2);

        Function<List<Integer>, Integer> function = x -> x.stream().map(i -> i*2)
                .mapToInt(i -> i).distinct().sum();
        Function<Integer, Integer> function2 = x -> x * 10;
        Function<Integer, Integer> function3 = x -> x * 100;

        int len = function.andThen(function2).andThen(function3).apply(Arrays.asList(1,2,2));
        System.out.println(len);

        ////////////////////////////////////

        //"John Doe" -> {"J","h","n","D","e"}
        // "Freddy Kruger" -> {"F","g","K","u","y"}
        String s = "John Doe";
        Map<Character, Integer>  map = new LinkedHashMap<>();
        char[] c = new char[s.length()];
        int flag = 0;
        for(int i=0; i<s.length();i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        for(Map.Entry e:map.entrySet()) {
            if((Integer) e.getValue() > 1) {
                continue;
            } else {
                c[flag] = (char)e.getKey();
                flag++;
            }
        }
        System.out.println(c);

        int a[] = { 3, 6, 32, 1, 8, 5, 31, 22 };
        Arrays.stream(a, 0, a.length).sorted().
                skip(a.length-2).limit(1).forEach(System.out::println);
        System.out.println("->"+Arrays.stream(a).boxed().sorted(Collections.reverseOrder()).skip(1).findFirst().get());
        //List<Integer> integer = Stream.of(a).sorted().collect(Collectors.toList());
        //System.out.println(Stream.of(a).sorted().skip(a.length-2).limit(1).collect(Collectors.toList()));
    }

}


