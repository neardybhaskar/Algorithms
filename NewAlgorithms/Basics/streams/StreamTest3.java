import java.util.HashMap;
import java.util.Map;

/**
 * CDK Qustions
 */
public class StreamTest3 {



    /*Problem: Longest Substring Without Repeating Characters

    Problem Statement:

    Given a string s, find the length of the longest substring without repeating characters.

            Example 1:

    Input: s = ”abcabcbb”

    Output: 3

    Explanation: The answer is abc with length of 3.

    Example 2:

    Input: s = ”bbbbb”

    Output: 1

    Explanation: The answer is b with length of 1.

    Example 3:

    Input: s = "pwwkew"

    Output: 3

    Explanation: The answer is "wke", with the length of 3.

    Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.*/

//Implement your code here
    //input: s = "pwwkew"
    //Input: s = ”abcabcbb”
    //Input: s = ”bbbbb”

    public static int lengthOfLongestSubstring(String s) {
        int maxCount = 0;
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                if(count > maxCount) {
                    maxCount = count;
                }
                count = 1;
            } else {
                map.put(s.charAt(i), null);
                count++;
            }
    }
    return maxCount;
    }

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("bb"));
    }



}
