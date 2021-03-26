package HackerRank;

import java.math.BigInteger;

/**
 * @author Bhaskar on 28-01-2021
 */
public class ExtraLongFactorial {

    public static void factorial(int a) {
        int temp = a;
        BigInteger bigInteger=new BigInteger("25");
        int value = 0;
        while( temp - 1 !=0 ) {
//            bigInteger.add(BigInteger.valueOf(a * (a - 1)));
            bigInteger = bigInteger.multiply(BigInteger.valueOf(temp - 1));
            --temp;
        }
        System.out.println(bigInteger);
    }

    public static void main(String[] args) {

        factorial(25);

    }

}
