public class NNaturalNumber {

    public static int naturalNumbers(int num) {
        int i = 1;
        int sum = 0;
        while(num>=i) {
            sum += i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(NNaturalNumber.naturalNumbers(n));
    }

}
