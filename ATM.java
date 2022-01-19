import java.util.Scanner;
public class ATM
{
    public static void main(String args[])
    {
        int withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.println("\n\t Enter your Balance : ");
        int balance = sc.nextInt();
        
        System.out.println("\n\t ATM(Automated Teller Machine)");
        System.out.println("\n\t 1.) Withdraw");
        System.out.println("\n\t 2.) Deposit");
        System.out.println("\n\t 3.) Check Balance");
        System.out.println("\n\t 4.) EXIT");
        System.out.println("\n\t Choose Your Option");
        ch = sc.nextInt();
        
        switch(ch)
        {
            case 1: 
            System.out.println("Enter amount to withdrawn");
            withdraw = sc.nextInt();
            if(balance >= withdraw)
            {
                balance = balance - withdraw;
                System.out.println("Amount Withdrawn : " + withdraw);
            }
            else
            {
                System.out.println("Insufficient Balance");
            }
            System.out.println("Balance after amount is withdrawn = " + balance);
            System.out.println("");
            break;
            
            case 2: 
            System.out.println("Enter amount to be deposited");
            deposit = sc.nextInt();
            balance = balance + deposit;
            System.out.println("Your amount has been successfully deposited");
            System.out.println("Balance after depositing = " + balance);
            System.out.println("");
            break;
            
            case 3:
            System.out.println("Balance is = " + balance);
            System.out.println("");
            break;
            
            case 4:
            System.exit(0);
            break;
            
            default: System.out.println("Incorrect Option, Try Again");
        }
    }
}