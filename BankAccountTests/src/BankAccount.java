public class BankAccount
{
    private String IBAN;
    private double balance;

    public BankAccount(String IBAN, double balance) {
        this.IBAN = IBAN;
        this.balance = balance;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double Deposit(double amount) throws AmountException
    {
        if(amount<=0)
        {
            throw new AmountException("Invalid amount !");
        }
        else
        {
            double balance = this.getBalance();
            balance+=amount;
            this.setBalance(balance);
        }

        return this.getBalance();
    }

    public double Withdraw(double amount) throws AmountException
    {
        if(amount<=0 || amount>this.getBalance())
        {
            throw new AmountException("Invalid amount !");
        }
        else
        {
            double balance = this.getBalance();
            balance-=amount;
            this.setBalance(balance);
        }
        return this.getBalance();
    }
}
