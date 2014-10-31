import java.util.Scanner;
public class Diamond2
{   public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the side length: ");
        int input = s.nextInt();
        int spaces = input - 1;
        String ast = "";
        for (int i = 0; i < spaces; i++)
        {
            ast += " ";
        }
        ast += "*";
        for (int i = 1 ; i < 2 * input; i++)
        {          
            if (i < input)
            {
                System.out.println(ast);
                ast = ast.substring(1);
                ast+= "**";
            }
            else if (i == input)
            {
                System.out.println(ast);
            }
            else
            {
                ast = " " + ast.substring(0,ast.length()-2);
                System.out.println(ast);
            }

        }
    }
}
