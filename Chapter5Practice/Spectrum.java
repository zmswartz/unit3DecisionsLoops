import java.lang.Math;
import java.util.Scanner;
/**
 * Write a description of class Spectrum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spectrum
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
        int a = 0;
        while (a < 7)
        {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the wavelength value: ");
            double wave = s.nextDouble();
            String output = "";
            if (wave > Math.pow(10,-1))
            {
                output = "Radio Wave";
            }
            else if (wave > Math.pow(10, -3))
            {
                output = "Microwaves";
            }
            else if (wave >  (7 * Math.pow(10, -7)))
            {
                output = "Infrared";
            }
            else if (wave > 4 * Math.pow(10, -7))
            {
                output = "Visible Light";
            }
            else if (wave > Math.pow(10, -8))
            {
                output = "Ultraviolet";
            }
            else if (wave > Math.pow(10, -11))
            {
                output = "X-rays";
            }
            else
            {
                output = "Gamma Rays";
            }
            System.out.println(output);
            a += 1;
        }
    }

}
