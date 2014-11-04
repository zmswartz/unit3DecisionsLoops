import java.util.Random;
public class MontyHall
{
    public static void main(String[] args)
    {
        Random randGenerator = new Random();
        
        int countSwitch = 0;
        int countStay = 0;
        for( int i = 1; i <=1000; i++)
        {
            int doorNum = randGenerator.nextInt(3)+1;
            int car = randGenerator.nextInt(3) + 1;
            if (car == doorNum)
            {
                countStay += 1;
            }
            else
            {
                countSwitch += 1;
            }
        }
        System.out.println("Stay correct: " + countStay);
        System.out.println("Switch correct: " + countSwitch);
    }
}
