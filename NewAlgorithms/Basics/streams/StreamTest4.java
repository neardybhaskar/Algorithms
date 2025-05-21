import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest4 {

    public static void main(String[] args) {


        Map<String,Integer> mapFruit = new HashMap<>();
        mapFruit.put("Apple" , 30);
        mapFruit.put("Grape" , 10);
        mapFruit.put("PineApple" , 40);
        for (Map.Entry fruits: mapFruit.entrySet()) {
            System.out.println(fruits.getKey()+" "+fruits.getValue());
        }
        //mapFruit.entrySet().stream().collect()
        Map<String , Integer> map = mapFruit.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        System.out.println(map);

    }

}
