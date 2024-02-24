import java.util.Scanner;
public class ATM
{
    public static void main(String [] args)
    {
        int balance=2000,withdraw,deposit;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("AUTOMATTED TELLER MACHINE");
            System.out.println("choose 1 for withdraw");
            System.out.println("choose 2 for Deposit");
            System.out.println("choose 3 for checkbalance");
            System.out.println("choose 4 for exist");
            System.out.println("choose the operation you want to perform:");
            int n=sc.nextInt();
            switch(n)
            {
                case 1:
                System.out.println("enter money to withdraw:");
                withdraw=sc.nextInt();
                if(balance>=withdraw)
                {
                    balance-=withdraw;
                    System.out.println("please collect your money");
                }
                else
                {
                    System.out.println("INSUFFICIENT BALANCE");
                }
                System.out.println("");
                break;
                case 2:
                System.out.println("enter money to deposit:");
                deposit=sc.nextInt();
                balance+=deposit;
                System.out.println("your money has been successfully deposited");
                System.out.println("");
                break;
                case 3:
                System.out.println("balance:"+balance);
                System.out.println("");
                break;
                case 4:
                System.exit(0);


                }

            }


        }
    } 
