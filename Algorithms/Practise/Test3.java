package Practise;

import java.util.Arrays;

/**
 * @author Bhaskar Singh
 * @date 4/17/2021 12:35 PM
 */
public class Test3 {


    public static void main(String[] args) {
        char[] c = new char[] {'b','h','a','s','k','a','r'};
       fizzBuzz(c);
    }

    public static void fizzBuzz(char[] n) {
        StringBuilder stringBuilder = new StringBuilder();
        /*for (int i=0; i<n.length; i++) {
            stringBuilder.append(n[i]);
        }*/
        try {
            System.out.println("A");

        } catch (Exception e) {
            System.out.println("B");
        }
        finally {
            System.out.println("c");
        }
        System.out.println("D");
    }

}
