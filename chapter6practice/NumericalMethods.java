import java.util.Scanner;

/**
 * Write a description of class NumericalMethods here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumericalMethods
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
        System.out.print("Enter a number: ");
        int  n = s.nextInt();
        int fold1 = 1;
        int fold2 = 1;
        for (int i = 1; i < n; i++)
        {
            int fnew = fold1 + fold2;
            fold1 = fold2;
            fold2 = fnew;
            
        }
        System.out.println("The " + n + "th term is " + fold2);
    }

}
