import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {

    public static void main(String[] args) {

        getStateName();

    }

    private static void getStateName() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("Maharashtra", List.of("Mumbai", "Pune"));
        map.put("UP", List.of("Raebareli", "Amethi"));
        map.put("Goa", List.of("Panji", "South Goa"));
        map.put("MP", List.of("Bhopal", "Indore"));
        /*List<Object> list = new ArrayList<>();
        list.add(List.of("Maharashtra", List.of("Mumbai", "Pune")));
        list.add(List.of("UP", List.of("Raebareli", "Amethi")));
        list.add(List.of("Goa", List.of("Panji", "South Goa")));
        list.add(List.of("MP", List.of("Bhopal", "Indore")));
        for (Object o : list) {
            o.toString();
        }*/
        for(Map.Entry string:map.entrySet()) {
            for (String s : (List<String>) string.getValue()) {
                if(s.equals("Pune")) {
                    System.out.println(string.getKey());
                    break;
                }
            }

        }
    }

}
