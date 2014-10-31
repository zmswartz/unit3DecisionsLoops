import java.util.Scanner;

public class Substrings
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = s.next();
        
        for (int i = 1; i <= word.length(); i++)
        {
            int a = 0;
            while ( a + i <= word.length())
            {
                System.out.println(word.substring(a, a+i));
                a++;
            }
        }
    }
}
