import java.util.Scanner;

/**
 * Write a description of class LeapYear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeapYear
{
    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the year: ");
        String output = "";
        int year = s.nextInt();
        if ((year%4==0) && (!(year%100==0) || (year%400==0)))
        {
            output = " is a leap year";
        }
        else
        {
            output = " is not a leap year";
        }
    
        System.out.print(year);
        System.out.println(output);
   }
}
