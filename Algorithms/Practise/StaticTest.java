package Practise;

/**
 * @author Bhaskar on 10-03-2021
 */
public class StaticTest {

    private SplitChar splitChar;

    private static int a;

    public static void testA() {
        System.out.println("Do nothing");
        (new SplitChar()).test();
    }

    public static void main(String[] args) {
        testA();
    }

}
