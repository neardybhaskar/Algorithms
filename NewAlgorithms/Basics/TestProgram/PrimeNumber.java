import java.util.Arrays;

public class PrimeNumber {

    public static void main(String[] args) {
        int[] input = new int[]{1,2,7,13,18,54,65,99};
        int[] prime = new int[input.length];
        int j=0;
        for(int i=0; i<input.length; i++) {
            if(isPrime(input[i])) {
                prime[j] = input[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(prime));
    }
    public static boolean isPrime(int element) {
        for(int i=2; i<Math.sqrt(element); i++) {
            if(element % i == 0) {
                return false;
            }
        }
        return true;
    }
}
