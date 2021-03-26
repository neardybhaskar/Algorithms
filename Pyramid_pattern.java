public class Pyramid_pattern {

    public static void main(String[] args) {

        int size = 5, k=0;
        for (int i = 1; i <= size; i++, k = 0) {
            for (int space = 1; space <= size - i;space++) {
                System.out.print("  ");
            }

            while(k != 2 * i -1) {
                System.out.print("* ");
                k++;
            }
            System.out.println();
        }

        for (int i = size - 1; i >=1; i--) {
            for (int space = 1; space <= size - i; space++) {
                System.out.print("  ");
            }

            for (int j = i; j<=2*i-1;j++) {
                System.out.print("* ");
            }

            for (int j = 0; j<i-1;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
