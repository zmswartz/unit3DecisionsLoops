
import java.util.Scanner;
/**
 * Write a description of class RewriteLoops here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RewriteLoops
{
    /**
     * Default constructor for objects of class RewriteLoops
     */
    public static void main(String[] args)
    {
        int s = 0;
        for (int i = 1; i <= 10; i++)
        {
            s = s + i;
        }
        
        s = 0;
        int i = 1;
        while( i <= 10)
        {
            s += i;
            i++;
        }
    }
    public static void main2(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double x = 0;
        double s;
        do
        {
            s = 1.0 / (1+n*n);
            n++;
            x = x + s;
        }
        while (s > 0.01);
        
        //rewrtie as while loop
        n = in.nextInt();
        x = 0;
        s = 1;
        while (s > 0.01)
        {
            s = 1.0 / (1+n*n);
            n++;
            x = x + s;
        }
    }
}
