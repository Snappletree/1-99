
/**
 * Write a description of class PrintOdd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PrintOdd
{
    public static void main (String arg[])
    {
        Scanner reader = new Scanner(System.in);
        int number = 1;
        while ( number!=1001)
        {
            System.out.print(number + " ");
            number = number + 2;
        }
    }
}
