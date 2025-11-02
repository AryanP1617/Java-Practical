import java.util.Scanner;

class Calculator
{
    public int add(int a,int b)
    {
        return a+b;
    }

    public double add(double a,double b)
    {
        return a+b;
    }

    public int sub(int a,int b)
    {
        return (a>b)?(a-b):(b-a);
    }

    public double sub(double a,double b)
    {
        return (a>b)?(a-b):(b-a);
    }

    public int multiply(int a,int b)
    {
        return a*b;
    }

    public double multiply(double a,double b)
    {
        return a*b;
    }

    public int divide(int a,int b)
    {
        return a/b;
    }

    public double divide(double a,double b)
    {
        return a/b;
    }
}


public class Calculation {
        public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Calculator calculator=new Calculator();

        String a=null,b=null;
        int num1=0,num2=0;
        double x,y;
        

        int choice=-1;
        while(choice!=5)
        {
            System.out.print("Enter 1 for addition\nEnter 2 for subtraction\nEnter 3 for multiplication\nEnter 4 for division\nEnter 5 for exiting the simulation\nEnter choice: ");
            choice=scanner.nextInt();
            scanner.nextLine();
            
            switch(choice)
            {
                case 1:
                    try{
                        System.out.print("Enter a number: ");
                        a=scanner.nextLine();
                        System.out.print("Enter another number: ");
                        b=scanner.nextLine();

                        num1=Integer.parseInt(a);
                        num2=Integer.parseInt(b);

                        System.out.println(calculator.add(num1,num2));

                        
                    }
                    catch(NumberFormatException e){

                        x=Double.parseDouble(a);
                        y=Double.parseDouble(b);

                        System.out.println(calculator.add(x,y));
                    }
                    break;
                
                case 2:
                    try{
                        System.out.print("Enter a number: ");
                        a=scanner.nextLine();
                        System.out.print("Enter another number: ");
                        b=scanner.nextLine();

                        num1=Integer.parseInt(a);
                        num2=Integer.parseInt(b);
                        
                        System.out.println(calculator.sub(num1,num2));
                    }
                    catch(NumberFormatException e){

                        x=Double.parseDouble(a);
                        y=Double.parseDouble(b);

                        System.out.println(calculator.sub(x,y));
                    }
                    break;
                case 3:
                    try{
                        System.out.print("Enter a number: ");
                        a=scanner.nextLine();
                        System.out.print("Enter another number: ");
                        b=scanner.nextLine();

                        num1=Integer.parseInt(a);
                        num2=Integer.parseInt(b);

                        System.out.println(calculator.multiply(num1,num2));
                        
                    }
                    catch(NumberFormatException e){

                        x=Double.parseDouble(a);
                        y=Double.parseDouble(b);

                        System.out.println(calculator.multiply(x,y));
                    }
                    break;
                case 4:
                    try{
                        System.out.print("Enter a number: ");
                        a=scanner.nextLine();
                        System.out.print("Enter another number: ");
                        b=scanner.nextLine();

                        num1=Integer.parseInt(a);
                        num2=Integer.parseInt(b);
                        
                        System.out.println(calculator.divide(num1,num2));

                    }
                    catch(NumberFormatException e){

                        x=Double.parseDouble(a);
                        y=Double.parseDouble(b);

                        System.out.println(calculator.divide(x,y));
                    }
                    break;
                }
        }   
        scanner.close();
    }
}
