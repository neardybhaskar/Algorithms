import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTest33 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 5);
        map.put("key2", 8);
        map.put("key3", 2);
        LinkedHashMap<String, Integer> sortMap = map.entrySet().stream().
                sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, _) -> e1, LinkedHashMap::new));
        //System.out.println(sortMap);
        Map<String, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        sortedMap.forEach((k,v) -> System.out.println(k+" "+v));
    }

}
