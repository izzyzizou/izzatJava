package compare;

/**
 * Created by Izzat on 5/24/2016.
 */
import java.util.*;
public class secretCode {
    static Scanner in = new Scanner(System.in);
    private static void readCode(int[] list)
    {
        System.out.print("Enter the secret Code: ");
        for(int i = 0; i < list.length; i++)
        {
            list[i] = in.nextInt();
        }
        System.out.println();
    }

    private static void compareCode(int[] list)
    {
        int length;
        int digit;
        boolean CodeOk;
        CodeOk = true;

        System.out.println("Enter the length of the copy of the secret Code: ");
        length = in.nextInt();

        if(list.length != length)
        {
            System.out.println("The original code and its copy are not of same length!");
            return;
        }
        System.out.println("Code Digit          Code Digit Copy");

        for(int i = 0; i < list.length; i++)
        {
           digit = in.nextInt();
            System.out.printf("%5d %15d", list[i], digit);
            if(digit != list[i])
            {
                System.out.println("Corresponding code digits not the same");
                CodeOk = false;
            }
            else
            {
                System.out.println();
            }
        }
        if(CodeOk)
        {
            System.out.println("Message transmitted ok");
        }
        else
        {
            System.out.println("Error");
        }
    }
    public static void main(String[] args)
    {
        int codeLength;
        System.out.println("Length: ");
        codeLength = in.nextInt();
        System.out.println();
        int[] codeArray = new int[codeLength];

        readCode(codeArray);
        compareCode(codeArray);
    }
}
