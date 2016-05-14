package twoDim;

/**
 * Created by Izzat on 5/14/2016.
 */
public class twoDimension {
    public static void printMatrix(int[][] matrix)
    {
        for(int row = 0; row < matrix.length; row++)
        {
            for(int col = 0; col < matrix[row].length; col++)
            {
                System.out.printf("%7d", matrix[row][col]);
            }
            System.out.println();
        }
    }
    public static void sumRows(int[][] matrix)
    {
        int sum;

        for(int row = 0; row < matrix.length; row++)
        {
            sum = 0;
            for(int col = 0; col < matrix[row].length; col++)
            {
                sum = sum + matrix[row][col];
            }
            System.out.println("The Sum of the elements of row" + (row + 1) + " = " + sum + ".");
        }
    }
    public static void largesInRows(int[][] matrix)
    {
        int largest;
        for(int row = 0; row < matrix.length; row++)
        {
            largest = matrix[row][0];
            for(int col = 1; col < matrix[row].length; col++)
            {
                if(largest < matrix[row][col])
                    largest = matrix[row][col];
            }
            System.out.println("The largest element of row " + (row + 1) + " = " + largest + ".");
        }
    }
}
