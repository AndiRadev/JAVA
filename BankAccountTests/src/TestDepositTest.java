import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;
public class TestDepositTest
{
    private BankAccount account;

    @Test
    public void testDepositNegativeAmountThrowException()
    {
        try
        {
            account = new BankAccount("kfkd323ksks322322", 800);
            account.Deposit(-34);
        }
        catch (AmountException am)
        {
            System.out.println(am.getMessage());
        }
    }

    @Test
    public void testDepositZeroAmountThrowException()
    {
        try
        {
            account = new BankAccount("GD7474838FNFNJ3", 800);
            account.Deposit(0);
        }

        catch(AmountException am)
        {
            System.out.println(am.getMessage());
        }
    }

    @Test
    public void testDepositAmountDeposit()
    {
        try
        {
           account=new BankAccount("JFJDJDJ434332KJKJDJD", 800);
           account.Deposit(200);
           Assertions.assertEquals(1000, account.getBalance());
        }
        catch(AmountException am)
        {
            System.out.println("Invalid amount");
        }
    }
}
