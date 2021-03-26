package HackerRank;

import java.util.Collections;

/**
 * @author Bhaskar on 28-01-2021
 */
public class FindDigits {

    public static void main(String[] args) {

        int n = 124;
        int count = 0;
        String a = String.valueOf(n);
        int[] arr = new int[a.length()];
        for (int i = 0; i < a.length(); i++) {
            try {
                if(n % Character.getNumericValue(a.charAt(i)) == 0) {
                    ++count;
                }
            } catch (ArithmeticException exception) {
                exception.printStackTrace();
            }
        }
        System.out.println(count);
    }

}
