import java.util.HashMap;
import java.util.Map;

/**
 * @author Bhaskar on 20-01-2021
 */
public class CharCountRepeated {

    public static String countRepeatedChar(String a) {
        int size = a.length();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<size; i++) {
            if(map.containsKey(a.charAt(i))) {
                int count = map.get(a.charAt(i));
                map.put(a.charAt(i), ++count);
            } else {
                map.put(a.charAt(i), 1);
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry<Character,Integer> m: map.entrySet()) {
            stringBuffer.append(m.getKey());
            stringBuffer.append(m.getValue());
        }
        System.out.println(stringBuffer.toString());
        return stringBuffer.toString();
    }

    public static void main(String[] args) {

        countRepeatedChar("bhaskar");

    }

}
