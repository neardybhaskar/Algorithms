package Amdocs;

/**
 * @author Bhaskar Singh
 * @date 6/5/2021 4:40 PM
 */
public class PyramidPattern {

    public static void drawPattern() {
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

    }

    public static void main(String[] args) {

        drawPattern();

    }

}
