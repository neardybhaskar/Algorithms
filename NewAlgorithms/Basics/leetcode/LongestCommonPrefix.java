import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    private static String longestCommonPrefix(String[] strs) {
        List<String> list = Arrays.asList(strs);
        Collections.sort(list);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int length = Math.min(first.length(), last.length());
        int i=0;
        while(i<length && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        if(i==0) {
            return "";
        }
        return first.substring(0, i);
    }

}
