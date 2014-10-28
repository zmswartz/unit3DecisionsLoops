import java.util.Scanner;

/**
 * Write a description of class a here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CompareAdjacent
{
    /**
     * Default constructor for objects of class a
     */
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        final double EPSILON = 1e-7;
        System.out.println("Enter a series of numbers (q to stop): ");
        double prevValue;
        double currentValue = s.nextDouble();
        while (s.hasNextDouble())
        {
            prevValue = currentValue;
            currentValue = s.nextDouble();
            if (Math.abs(currentValue - prevValue) < EPSILON)
            {
                System.out.println("Duplicate numbers. ");
                break;
            }
        }
    }
}
