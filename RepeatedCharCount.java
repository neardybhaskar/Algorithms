import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Bhaskar on 19-01-2021
 */
public class RepeatedCharCount {

    public static Map<Character,Integer> findRepeatedCharCount(String string) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i= 0; i<string.length();i++) {
            if(map.containsKey(string.charAt(i))) {
                int count = map.get(string.charAt(i));
                map.put(string.charAt(i), ++count);
            } else {
                map.put(string.charAt(i), 1);
            }
        }
        return map;
    }

    public static void findRepeatedCount(String s) {
        boolean duplicate = false;
        char[] arr = new char[s.length()*2];
        int k = 0;
            for(int j=0;j<arr.length;j+=2) {
                /*if(arr[k] != '\0') {
                    if(arr[k] == s.charAt(j)) {
                        duplicate = true;
                        ++arr[k+1];
                        k=k+2;
                    } else {
                        arr[k] = s.charAt(j);
                    }
                } else {
                    arr[k] = s.charAt(j);
                }
                k+=2;*/
                while (k < s.length()) {
                    /*if(arr[j] == '\0') {
                        arr[j] = s.charAt(k);
                    } else {
                        if(arr[j] == s.charAt(k)) {
                            duplicate = true;
                            ++arr[j+1];
                        } else {
                            arr[j] = s.charAt(k);
                        }
                    }*/
                    if(arr[j] != s.charAt(k)) {
                        arr[j] = s.charAt(k);
                    }
                    k++;
                }
            }
            System.out.println(arr);
        }

    public static void main(String[] args) {

        String text = "bhaskar";
        findRepeatedCount(text);
        /*Map<Character, Integer> map = findRepeatedCharCount(text);
        map.forEach((k,v) -> System.out.print(k+""+v));*/
    }

}
