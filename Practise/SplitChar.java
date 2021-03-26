package Practise;

/**
 * @author Bhaskar on 06-03-2021
 */
public class SplitChar {

    public void test() { }

    public static void main(String[] args) {

        int row = 2;
        int column = 3;
        int[][] matrix = {{1,2,3},{3,4,5}};
        int [] rowSumArray = new int[matrix.length];
        int[] columnSumArray = new int[matrix[0].length];

        for(int i=0;i<row;i++) {
            int rowSum = 0;
            for(int j=0;j<column;j++) {
                rowSum+=matrix[i][j];
            }
            rowSumArray[i]=rowSum;
        }

        for(int i=0;i<column;i++) {
            int colSum = 0;
            for(int j=0;j<row;j++) {
                colSum+=matrix[j][i];
            }
            columnSumArray[i]=colSum;
        }

    }

}
