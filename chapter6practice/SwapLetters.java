import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class SwapLetters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SwapLetters
{
    /**
     * Default constructor for objects of class SwapLetters
     */
    public static void main(String[] args)
    {
        Scanner s =  new Scanner(System.in);
        Random generator = new Random();
        System.out.print("Enter a word: ");
        String word = s.next();
        for (int count =0; count < word.length(); count++)
        {
            int indexi = generator.nextInt(word.length()-1);
            int indexj = -1;
            String output = "";
            while (!(indexj > indexi))
            {
                indexj = generator.nextInt(word.length());
            }
            if (indexi != 0)
            {
                output += word.substring(0,indexi);
            }
            output += word.charAt(indexj);
            output += word.substring(indexi + 1, indexj);
            output += word.charAt(indexi);
            if (indexj != word.length()-1)
            {
                output += word.substring(indexj+1, word.length());
            }
            word= output;
        }
        System.out.println(word);
    }
}
