import java.util.Scanner;

/**
 * Write a description of class a here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FindMax
{
    /**
     * Finds the maximum value in the specified series of numbers.
     */
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a series of numbers (q to stop): ");
        double currentMax = s.nextDouble();
        
        while (s.hasNextDouble())
    
        {
            double value = s.nextDouble();
            if (value > currentMax)
            {
                currentMax = value;
            }
        }
        System.out.println("Maximum value: " + currentMax);
    }

}
