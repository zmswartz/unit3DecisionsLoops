

/**
 * Write a description of class NestedLoops here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NestedLoops
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
        System.out.println("For Loop");
        for (int i = 1; i < 3; i++)
        {
            for (int a = 1; a < 5; a++)
            {
                System.out.println(i + " " + a);
            }
        }
        
        int i = 1;
        int a = 1;
        System.out.println("\nWhile Loop");
        while (i < 3)
        {
            while( a < 5)
            {
                System.out.println(i + " " + a);
                a++;
            }
            i++;
            a = 1;
        }
        i = 1;
        a = 1;
        System.out.println("\nDo While Loop");
        do
         {
             do
             {
                 System.out.println(i + " " + a);
                 a++;
              }
              while (a < 5);
              i++;
              a= 1;
            }
        while (i < 3);
    }

}
