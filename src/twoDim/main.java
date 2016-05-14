package twoDim;

/**
 * Created by Izzat on 5/14/2016.
 */
public class main {
    public static void main(String[] args)
    {
        int[][] board = {{23,5,6,15,18},{4,16,24,67,10},{12,54,23,76,11},{1,12,34,22,8},{81,54,32,67,33},{12,34,76,78,9}};

        twoDimension.printMatrix(board);
        System.out.println();
        twoDimension.sumRows(board);
        System.out.println();
        twoDimension.largesInRows(board);
    }
}
