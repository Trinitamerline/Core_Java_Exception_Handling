package pkbanking.pkcustomer;

import pkbanking.pkaccount.Account;
import pkbanking.pkaccount.fd.FDAccount;
import pkbanking.pkaccount.sb.SBAccount;
import pkbanking.pkexception.InsufficientFundsException;

import java.util.Scanner;

public class Customer {
    int cust_id;
    String name;
    String address;
    SBAccount sb;
    FDAccount fd;
    Scanner scanner = new Scanner(System.in);
    static int sbno = 348740;
    static int fdno = 369830;
    public Customer(int cust_id, String name, String address) {
        this.cust_id = cust_id;
        this.name = name;
        this.address = address;
    }
    public void createAccount(int type)
    {
        if(type == 1)
        {
            System.out.println("Enter initial balance of new SB account:");
            double balance = scanner.nextDouble();
            sb = new SBAccount(sbno++,balance);
        }
        else if(type == 2)
        {
            System.out.println("Enter initial deposit amount & period of new FD account:");
            double balance = scanner.nextDouble();
            int period = scanner.nextInt();
            fd = new FDAccount(fdno++,balance,period);
        }
        else
        {
            System.out.println("Invalid choice:");
        }
    }
    public void transaction(int type) throws InsufficientFundsException {
        if(type == 1)
        {
            System.out.println("Enter amount to be deposited:");
            double amount = scanner.nextDouble();
            sb.deposit(amount);
        }
        else if(type == 2)
        {
            System.out.println("Enter amount to be withdraw:");
            double amount = scanner.nextDouble();
            sb.withdraw(amount);
        }
        else if(type == 3)
        {
            sb.calc_interest();
        }
        else if(type == 4)
        {
            fd.close();
        }
        else
        {
            System.out.println("Invalid choice");
        }
    }
}
