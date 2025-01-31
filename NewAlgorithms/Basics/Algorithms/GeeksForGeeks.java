public class GeeksForGeeks {

    public static void main(String[] args) {
        long num = 1234567890;
        long temp = num;
        int count = 0;
        while(temp != 0) {
            temp = temp / 10;
            count++;
        }
        System.out.println(count);
    }

}
