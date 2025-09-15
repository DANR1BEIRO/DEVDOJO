package academy.devdojo.maratonajava.introduction.class05Arrays;

// Try writing a 4x4 matrix and print only the diagonal elements using a foreach loop.
public class QuickChallengeArrays4x4Diagonal {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        /*
        * Diagonal elements:
        * row 0 and column 0 = 1
        * row 1 and column 1 = 6
        * row 2 and column 2 = 11
        * row 3 and column 3 = 16
        * */

        int rowIndex = 0;

        for (int[] row : matrix){
            int columnIndex = 0;

            for(int number : row){
                if(columnIndex == rowIndex){
                    System.out.println(number);
                }
                columnIndex++;
            }
            rowIndex++;
        }

        System.out.println();

        int rowIndex2 = 0;
        int size = matrix.length;

        for (int[] row : matrix){
            int columnIndex = size - 1 - rowIndex2;
            System.out.println(matrix[rowIndex2][columnIndex]);
            rowIndex2++;
        }

        System.out.println( );

        for (int i = 0; i < matrix.length ; i++) {
            System.out.println(matrix[i][i]);
        }
    }
}
