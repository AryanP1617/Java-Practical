import java.util.InputMismatchException;
import java.util.Scanner;

public class Numbers{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        try{
            int a=-1,b=0;
            
            while(a!=0)
            {
                System.out.print("Enter a number: ");
                a=scanner.nextInt();
                if(a%2==0)
                {
                    b+=a;
                }
            }
            System.out.println("The entered sum is "+b);
        }
        catch(InputMismatchException e)
        {
            throw new IllegalArgumentException("Enter a number!!!");
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        finally{
            scanner.close();
        }
    }
}