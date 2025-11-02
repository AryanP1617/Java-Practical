import java.util.Scanner;

public class Two_Integers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a,b;
        System.out.print("Enter a number: ");
        a=scanner.nextInt();
        System.out.print("Enter a second number: ");
        b=scanner.nextInt();
        System.out.println("The sum of two integer is: "+(a+b));
        System.out.println("The difference of two integers is: "+((a>b)?(a-b):(b-a)));
        System.out.println("The average of two integers is: "+(a+b)/2);
        System.out.println("The product of the two integers is "+(a*b));
        System.out.println("The maximum of the two integers is "+((a>b)?a:b));
        System.out.println("The minimum of two integers is "+((a<b)?a:b));        
        scanner.close();
    }
}
