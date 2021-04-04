package Practise;

/**
 * @author Bhaskar Singh
 * @date 4/5/2021 12:13 AM
 */

interface Test2 {
    public int test2(int a, int b, int c, long d);
}

public class MethodReference {

    public int test(int i, int i1, int i2, long l) {
        System.out.println(i+" "+i1+" "+i2+" "+l);
        return ((int)(i1+l));
    }
}

class Caller {

    public static void main(String[] args) {
        MethodReference methodReference = new MethodReference();
        Test2 o = methodReference::test;
        o.test2(1,1,1,1L);
    }

}
