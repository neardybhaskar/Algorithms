package HackerRank;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Bhaskar on 28-01-2021
 */
public class FindDigits {

    private int a;

    private int b;

    public FindDigits(int a, int b) {
        this.a = a;
        this.b = b;
    }

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

        Set<FindDigits> test = new TreeSet<>();
        FindDigits findDigits = new FindDigits(1,1);
        FindDigits findDigits1 = new FindDigits(2,3);
        FindDigits findDigits2 = new FindDigits(3,4);

        test.add(findDigits);
        test.add(findDigits1);
        test.add(findDigits2);
        System.out.println(test);
    }

}
