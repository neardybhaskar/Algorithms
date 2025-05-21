import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StreamTest24 {

    public static void main(String[] args) {

        Map map = new HashMap();
        String[] arr = {"abc", "abcd", "ab", "afg", "adb"};
        String[] sortedArr = arr;
        for(int i=0; i< arr.length;i++) {
            Arrays.sort(sortedArr[i].toCharArray());
            //sortedArr[i] = String.valueOf(sortedArr[i]);
        }
        for(int i=0; i< arr.length;i++) {
            System.out.println(sortedArr[i]);
        }
        //Arrays.stream(arr).flatMapToInt(String::chars)
    }
    /*Given an array of string,

    write a Java8 program that return false if the string is not in ascending order.
            output:
    abc->true
    abcd->true
    ab->true
    afg->true
    adb->false*/


}
