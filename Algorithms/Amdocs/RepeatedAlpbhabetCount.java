package Amdocs;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Bhaskar Singh
 * @date 6/3/2021 12:29 AM
 */
public class RepeatedAlpbhabetCount {

    public static void countAlphabet(String alphabet) {
        char[] s = alphabet.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<s.length; i++) {
            if(s[i] == ' ') {

            } else if(map.containsKey(alphabet.charAt(i))) {
                int count = map.get(alphabet.charAt(i));
                map.put(alphabet.charAt(i),++count);
            } else {
                map.put(alphabet.charAt(i), 1);
            }
        }
        /*StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, Integer> value:
             map.entrySet()) {
            stringBuilder.append(value.getKey()+""+value.getValue());
        }*/
        System.out.println(map);
    }

    public static void main(String[] args) {

        String alphabet = "I am bhaskar Singh";

        countAlphabet(alphabet);

    }

}
