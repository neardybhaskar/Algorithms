package functionalProgramming;

/**
 * @author Bhaskar on 01-01-2021
 */
@FunctionalInterface
interface LambdaInterface {

    public void test();

}

public class LambdaTest {

    public void reverse() {
        System.out.println("Reverse test");
    }

    public static void main(String[] args) {
        /*LambdaInterface lambdaInterface = (s) -> {
            System.out.println(s);
        };*/
        int a = 120;
        LambdaTest lambdaTest = new LambdaTest();
        LambdaInterface lambdaInterface1 = lambdaTest::reverse;
        lambdaInterface1.test();

    }

}
