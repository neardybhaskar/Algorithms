import java.util.HashMap;
import java.util.Map;

public class StreamTest5 {

    public static void main(String[] args) {
        String str ="aabcccdaaccddd";
        int count = 0;

        for (int i=0; i<str.length();i++) {
            if(i+1 < str.length()) {
                if(str.charAt(i) != str.charAt(i+1)) {
                    count++;
                    System.out.print(str.charAt(i)+""+count+" ");
                    count = 0;
                } else {
                    count++;
                }
            }
            if(i == str.length()-1) {
                count++;
                System.out.println(str.charAt(i)+""+count);
            }
        }

        /*Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++) {
            if(map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        for(Map.Entry e: map.entrySet()) {
            System.out.print(e.getKey()+""+e.getValue()+" ");
        }*/
    }

}
