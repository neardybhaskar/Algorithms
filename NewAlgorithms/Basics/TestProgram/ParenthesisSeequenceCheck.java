import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ParenthesisSeequenceCheck {

    public static void main(String[] args) {
        String input = "{{()][}}";
        System.out.println(isValid(input));
    }

    public static boolean isValid(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch: input.toCharArray()) {
            /*if(ch == '{') {
                stack.push(ch);
            } else if(ch == '}') {
                if(stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }
            if()*/
            switch (ch) {
                case '(', '{', '[' -> stack.push(ch);
                case ')' -> {
                    if(stack.isEmpty() || stack.pop() != '(') return false;
                }
                case '}' -> {
                    if(stack.isEmpty() || stack.pop() != '{') return false;
                }
                case ']' -> {
                    if(stack.isEmpty() || stack.pop() != '[') return false;
                }
            }
        }
        return true;
    }

    char[] ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g','h','i', 'j','k','l','m','n','o','p','q','r','s','t','u', 'v', 'w', 'x', 'y', 'z'};


    char[] input = {'b', 'c', 'd'};

    public static int longestSequence(char[] input) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 4);
        map.put('e', 5);
        map.put('b', 2);
        map.put('b', 2);
        map.put('b', 2);
        map.put('b', 2);
        map.put('b', 2);
        map.put('b', 2);
        map.put('b', 2);
        map.put('b', 2);
        map.put('b', 2);
        map.put('b', 2);
        map.put('b', 2);
        map.put('b', 2);

        Arrays.sort(input);
        for (int i=0; i<input.length;i++) {

        }
        return 0;
    }
}
