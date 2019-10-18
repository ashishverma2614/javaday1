import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Range to find prime number ");
        System.out.println("Enter lower range value :");
        int num1 = input.nextInt();
        System.out.println("Enter higher range value :");
        int num2 = input.nextInt();
        
        boolean flag = false;
        for(int j = num1 ; j <=num2; j++)
        {
             flag = false;
            for(int i = 2; i <= j/2; ++i)
            {
                // condition for nonprime number
                if(j % i == 0)
                {
                    flag = true;
                    break;
                }
            }
            if (flag == false )
                System.out.println( j + " is a prime number.");
            else
            {
                //System.out.println( j + " is not a prime number.");
            }
        }
    }
}
