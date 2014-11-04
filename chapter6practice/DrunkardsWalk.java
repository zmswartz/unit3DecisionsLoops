import java.util.Random;

/**
 * Write a description of class DrunkardsWalk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrunkardsWalk
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
        int xcord = 0;
        int ycord = 0;
        Random generator = new Random();
        for (int i = 0; i<100; i++)
        {
            int a = generator.nextInt(4);
            if ( a ==0)
            {
                xcord++;
            }
            else if (a==1)
            {
                xcord--;
            }
            else if (a==2)
            {
                ycord--;
            }
            else
            {
                ycord++;
            }
        }
        System.out.println("(" + xcord + ", " + ycord + ")");
    }

}
