/**
 * Created by Izzat on 5/13/2016.
 */
import java.util.*;
public class oneDimension {
    public static void fillArray(int[] list)
    {
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < list.length; i++)
        {
            list[i] = in.nextInt();
        }

    }
    public static void printArray(String[] list)
    {
        for(int i = 0; i < list.length; i++)
        {
            System.out.println(list[i] + " ");
        }
    }
    public static int sum(int[] list)
    {
        int sum = 0;
        for(int i = 0; i < list.length; i++)
        {
            sum = sum + list[i];
        }
        return sum;
    }
    public static int findLargestNum(int[] list, int length)
    {
        int maxIndex = 0;
        for(int i = 1; i < length; i++)
        {
            if(list[maxIndex] < list[i])
            {
                maxIndex = i;
            }
        }
        return list[maxIndex];
    }
    //find the index number from the list
    public static int seqSearch(int[] list, int numOfElement, int searchItem)
    {
        int locate;
        boolean found = false;
        locate = 0;

        while(locate < list.length && !found)
        {
            if(list[locate] == searchItem)
                found = true;
            else
                locate++;
        }
        if(found)
            return locate;
        else
            return -1;
    }
    public static double largest(double ... numList)
    {
        double max;
        if(numList.length != 0)
        {
            max = numList[0];

            for(int i = 1; i < numList.length; i++)
            {
                if(max < numList[i])
                    max = numList[i];
            }
            return max;
        }
        return 0.0;
    }
}
