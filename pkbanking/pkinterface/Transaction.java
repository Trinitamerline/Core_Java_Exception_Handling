package pkbanking.pkinterface;

import pkbanking.pkexception.InsufficientFundsException;

public interface Transaction {
    double min_balance = 500;
    public void withdraw(double amount)throws InsufficientFundsException;
    public void deposit(double amount);

}
