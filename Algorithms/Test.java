import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    public static Map<Character, Integer> mergeArrays(String s) {

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                int cnt = map.get(c);
                map.put(c, ++cnt);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        Test test = new Test();
        String s = "bhaskar";

        Map<Character, Integer> m = test.mergeArrays(s);
        for (Map.Entry<Character, Integer> map: m.entrySet()) {
            System.out.print(map.getKey());
            System.out.print(map.getValue());
        }
        Arrays.sort(s.toCharArray());
        System.out.println(String.valueOf(s));

        List<String> findRankArr = new ArrayList<>();
        findRankArr.add("abc");
        findRankArr.add("abc");
        findRankArr.add("abc");
        findRankArr.add("abc");
        findRankArr.add("abc");
        findRankArr.add("abc");
        List<String> test1 = findRankArr.stream().map(element -> element.toUpperCase())
                .collect(Collectors.toList());
    }
}
