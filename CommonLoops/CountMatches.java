import java.util.Scanner;

/**
 * Write a description of class CountMatches here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CountMatches
{
    /**
     * Counts the number of " " in a string
     */
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = s.nextLine();
        int spaces = 0;
        
        for ( int index = 0; index < input.length(); index++)
        {
            char ch = input.charAt(index);
            if (ch == ' ')
            {
                spaces++;
            }
        }
        System.out.println("Number of spaces: " + spaces);
    }
}
