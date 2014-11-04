import java.util.Scanner;
public class DiamondNested
{   public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the side length: ");
        int input = s.nextInt();
        
        
        for (int i = 1 ; i <= input * 2 -1; i++)
        { 
            String ast = "";
            int count = 0;
            while (2 * i - 1 > count && count < input*2 -1 )
            {
                ast += "*"; 
                count += 1;
            }
            if (i > input)
            {
                ast = ast.substring(0,ast.length() - 2 * (i-input) );
            }
            while (ast.length() < 2* input -1)
            {
                ast = " " + ast + " ";
            }
            System.out.println(ast);
        }
    }
}
