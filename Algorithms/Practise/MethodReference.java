package Practise;

import java.io.File;
import java.io.IOException;

/**
 * @author Bhaskar Singh
 * @date 4/5/2021 12:13 AM
 */

interface Test2 {
    public int test2(int a, int b, int c);
}

public class MethodReference {

    int a = 10;

    public int test(int i, int i1, int i2) {
        System.out.println(i+" "+i1+" "+i2+" ");
        return ((int)(i1));
    }
}

class Caller {

    public static void main(String[] args) throws IOException {

        MethodReference methodReference = new MethodReference();
        System.out.println(methodReference.a);
        /*Test3 o = methodReference::test;
        o.test2(1,1,1);*/
    }

}
