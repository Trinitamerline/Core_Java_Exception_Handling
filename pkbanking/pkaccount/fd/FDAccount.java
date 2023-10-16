package pkbanking.pkaccount.fd;

import pkbanking.pkaccount.Account;
import pkbanking.pkinterface.InterestRate;

public class FDAccount extends Account implements InterestRate {
    int period;

    public FDAccount(int accnumber, double balance, int period) {
        super(accnumber, balance);
        this.period = period;
        System.out.println("New FD Account created with AccountNumber:"+accnumber+"& with Balance:"+balance+"for the period of:"+period);
    }

    public double calc_interest() {
        return balance*fdrate*period/(12*100);
    }

    public void close()
    {
        System.out.println("Current Balance:"+balance);
        balance = balance+calc_interest();
        System.out.println("Maturity Amount:"+balance);
    }
}
