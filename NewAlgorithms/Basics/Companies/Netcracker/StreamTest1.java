/*
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Netcracker

public class StreamTest1 {

    public static void main(String[] args) {
        //"John Doe" -> {"J","h","n","D","e"}
        // "Freddy Kruger" -> {"F","g","K","u","y"}
        String s = "John Doe";
        Map<Character, Integer>  map = new HashMap<>();
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
        //List<Integer> integer = Stream.of(a).sorted().collect(Collectors.toList());
        //System.out.println(Stream.of(a).sorted().skip(a.length-2).limit(1).collect(Collectors.toList()));
    }

}


*/
