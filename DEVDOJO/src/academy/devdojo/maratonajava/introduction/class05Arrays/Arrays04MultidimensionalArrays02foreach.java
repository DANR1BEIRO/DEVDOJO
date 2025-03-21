package academy.devdojo.maratonajava.introduction.class05Arrays;

public class Arrays04MultidimensionalArrays02foreach {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3}, // row
                {4, 5, 6}, // row
                {7, 8, 9}  // row
        // each row is a separate 1D array inside the matrix array
        };

        // using foreach to iterate over the matrix
        for(int[] row : matrix){      // iterating through each row(i)
            for(int number : row){    // iterating through each element(j) in the row(i)
                System.out.print(number + "   ");
            }
            System.out.println();
        }
    }
}
