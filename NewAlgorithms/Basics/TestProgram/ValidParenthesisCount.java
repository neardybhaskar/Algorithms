import java.util.Stack;

public class ValidParenthesisCount {
    public static void main(String[] args) {
        String input = "{{ad{as{cdc}}}}";
        System.out.println(validCount(input));
    }

    public static int validCount(String input) {
        int validCount = 0;
        Stack<Character> stack = new Stack<>();
        for(char ch : input.toCharArray()) {
            if(ch == '{') {
                stack.push(ch);
            } else if(ch == '}') {
                if(!stack.isEmpty() || stack.pop() == '{') {
                    validCount++;
                }
                }
            }
            return validCount;
        }
}
