import java.util.Scanner;

/**
 * Write a description of class a here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FindFirstMatch
{

    /**
     * Finds the first space ' ' in the string
     */
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = s.nextLine();
        int index = 0;
        boolean found = false;
        while ( !found && index < input.length())
        {
            char ch = input.charAt(index);
            if (ch == ' ')
            {
                found = true;
            }
            index ++;
        }
        if (found)
        {
            System.out.println("Index of first space: " + (index-1));
        }
        else
        {
            System.out.println("No spaces found");
        }
    }

}
