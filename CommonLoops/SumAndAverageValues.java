import java.util.Scanner;

/**
 * Write a description of class SumAndAverageValues here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SumAndAverageValues
{
    /**
     * This method computes the sum of a number of inputs and then
     * computes the average of those inputs.
     */
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        double total = 0;
        int count = 0;
        System.out.println("Enter one number at a time or q to quit: ");
        while(s.hasNextDouble())
        {
            double value = s.nextDouble();
            total += value;
            count++;
        }
        double average = 0;
        if (count !=0)
        {
            average = total / count;
        }
        System.out.println("Total: " + total + " Average: " + average);
    }
}
