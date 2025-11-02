import java.util.Scanner;

class Account{
    private int id;
    private double money;
    private String password;

    public Account(int id,double money,String password)
    {
        this.id=id;
        this.money=money;
        this.password=password;
    }

    public boolean verify(int user_id,String user_password)
    {
        if(user_id!=id)
        {
            System.out.println("Incoorect id");
            return false;
        }

        if(!(user_password.equals(password)))
        {
            System.out.println("Incorrect password");
            return false;
        }
        return true;
    }

    public void deposit(double amount)
    {
        money+=amount;
    }

    public double withdraw(double amount)
    {
        money-=amount;
        return amount;
    }

    public boolean SecureCheck(double amount)
    {
        if(money-amount<0)
        {
            return false;
        }

        return true;
    }

    public double getBalance()
    {
        return money;
    }

}


public class Atm {
    public static void main(String[] args) {

        Account userAccount=null;
        int condition=0;
        int id;
        double money;
        String password;

        Scanner scanner=new Scanner(System.in);
        int choice1=-1;
        
        
        while(true)
        {
            System.out.print("Enter 1 to create bank account\nEnter 2 to login into bank account\nEnter choice: ");
            choice1=scanner.nextInt();
            System.out.println(" ");
            if(choice1==1)
            {
            System.out.print("Enter your id: ");
            id=scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter you password: ");
            password=scanner.nextLine();
            System.out.print("Enter the money you want to deposit: ");
            money=scanner.nextDouble();
            userAccount=new Account(id, money, password);
            System.out.println(" ");
        }
        
        
        if(choice1==2)
        {
            System.out.print("Enter your id: ");
            id=scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter you password: ");
            password=scanner.nextLine();
            
            if(userAccount.verify(id, password))
            {
                condition=1;
                System.out.println(" ");
                break;
            }
            
        }
            
        }

             

        if(condition==1)
        {
            int choice2=-1;
            while(choice2!=4)
            {                
                System.out.print("Enter 1 for depositing\nEnter 2 for withdrawing\nEnter 3 for viewing balance\nEnter 4 for exiting\nEnter choice: ");
                choice2=scanner.nextInt();
                System.out.println(" ");

                switch (choice2) {
                    case 1:
                        System.out.print("Enter the amount you want to deposit: ");
                        double deposit_amount=scanner.nextDouble();
                        userAccount.deposit(deposit_amount);
                        System.out.println(" ");
                        break;
                
                    case 2:
                        System.out.print("Enter the amount you want to withdraw: ");
                        double withdraw_amount=scanner.nextDouble();
                        System.out.println(" ");
                        if(userAccount.SecureCheck(withdraw_amount))
                        {
                            userAccount.withdraw(withdraw_amount);
                        }
                        else
                        {
                            System.out.println("Low Balance...Please try again");
                        }
                        break;
                    case 3:
                        System.out.println("The current balance is: "+userAccount.getBalance());
                        System.out.println(" ");
                        break;
                }

                System.out.println(" ");
            }
        }
        scanner.close();
    }
}
