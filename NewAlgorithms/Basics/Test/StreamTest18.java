import java.util.HashMap;
import java.util.Map;

public class StreamTest18 {

    public static void main(String[] args) {
        //Write a program to find all permutations of a given string. Avoid duplicates if the string contains repeating characters.
        String str = "hello welcome to java java is most popular language";
        String[] arr = str.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        System.out.println(map);
    }

}
