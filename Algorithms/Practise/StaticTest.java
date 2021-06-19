package Practise;

/**
 * @author Bhaskar on 10-03-2021
 */
public class StaticTest {

    private SplitChar splitChar;

    private static int a;

    static {
        try {
            a = test();
        } catch(Exception e) {
            e.getStackTrace();
        }
    }


    public static void testA() {
        int b = 10;
        System.out.println("Do nothing");
        (new SplitChar()).test();
    }

    public static void autobixingTest(Integer integer) {
        System.out.println(integer);
    }

    public static int test() {
        return 1;
    }

    public static void main(String[] args) {
        testA();
        int b = 5;
        autobixingTest(b);
    }

}
