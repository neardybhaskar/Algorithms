import java.util.HashMap;
import java.util.Map;

public class StreamTest30 {

    public static void main(String[] args) {
        //Find if s1 contains s2
        /*s1 = aabbcc
        abc NO
        bbc Yes
        aab Yes
        baa Yes*/
        String s1 = "aabbcc";
        String s2 = "bbc";
        boolean result = containsAnagram(s1, s2);
    }

    static boolean containsAnagram(String s1, String s2) {
        if(s2.length() > s1.length()) {
            return false;
        }
        HashMap<Character, Integer> s2Count = new HashMap<>();
        for(char c: s2.toCharArray()) {
            s2Count.put(c, s2Count.getOrDefault(c, 0)+1);
        }
        int len = s2.length();
        for(int i=0; i<=s1.length() - len; i++) {
            String sub = s1.substring(i, i+len);
            if(isAnagram(sub, s2Count)) {
                return true;
            }
        }
        return false;
    }

    static boolean isAnagram(String sub, Map<Character, Integer> count) {
        Map<Character, Integer> subCount = new HashMap<>();
        for(char c: sub.toCharArray()) {
            subCount.put(c, subCount.getOrDefault(c,0)+1);
        }
        return subCount.equals(count);
    }

}
