package pkbanking.pkaccount.sb;

import pkbanking.pkaccount.Account;
import pkbanking.pkexception.InsufficientFundsException;
import pkbanking.pkinterface.InterestRate;
import pkbanking.pkinterface.Transaction;

public class SBAccount extends Account implements Transaction, InterestRate {
    public SBAccount(int accnumber, double balance) {
        super(accnumber, balance);
        System.out.println("New SB Account created with AccountNumber:"+accnumber+" & with Balance:"+balance);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if(balance-amount > min_balance)
        {
            System.out.println("Current Balance:"+balance);
            balance = balance - amount;
            System.out.println("New Balance after withdrawn:"+balance);
        }
        else
        {
            InsufficientFundsException InsufficientFundsException = null;
            throw InsufficientFundsException;
        }
    }

    @Override
    public void deposit(double amount) {
        if(amount >= 0)
        {
            System.out.println("Current Balance:"+balance);
            balance = balance + amount;
            System.out.println("New Balance after deposited:"+balance);
        }
        else
        {   try {
            Exception IllegalArgumentException = null;
            throw IllegalArgumentException;
        }catch (Exception e)  {
            throw new RuntimeException(e);
        }
        }
    }
    public void calc_interest()
    {
        System.out.println("Actual Balance:"+balance);
        balance = balance + balance*sbrate/(12*100);
        System.out.println("New Balance with Interest:"+balance);
    }
}
