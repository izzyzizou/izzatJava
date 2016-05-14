package twoDim;

/**
 * Created by Izzat on 5/14/2016.
 */
public class main {
    public static void main(String[] args)
    {
        int[][] list = new int[10][5];
        list[2][2] = 25;

        for(int i = 0; i <list.length; i++)
        {
            System.out.println(list[i][i]);
        }
    }
}
