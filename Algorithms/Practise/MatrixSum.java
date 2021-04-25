package Practise;

/**
 * @author Bhaskar on 07-03-2021
 */
public class MatrixSum {

    public static void main(String[] args) {

        int row = 2;
        int column = 3;
        int[][] matrix = {{1,2,3},{3,4,5}};
        int [] rowSumArray = new int[matrix.length];
        int[] columnSumArray = new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++) {
            int rowSum = 0;
            for(int j=0;j<matrix[0].length;j++) {
                rowSum+=matrix[i][j];
                System.out.println(rowSum);
            }

            rowSumArray[i] = rowSum;
        }
        for(int i=0;i<matrix[0].length;i++) {
            int colSum = 0;
            for (int j = 0; j < matrix.length; j++) {
                colSum += matrix[j][i];
                System.out.println(colSum);
            }
            columnSumArray[i] = colSum;
        }
    }
}
