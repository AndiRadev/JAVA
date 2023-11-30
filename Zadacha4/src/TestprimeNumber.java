import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class TestprimeNumber
{
    @Test
    public void testprimeNumberIsPrime()
    {
        int number = 13;
        boolean expected = true;
        boolean actual = Main.primeNumber(number);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testprimeNumberIsNotPrime()
    {
        int number = 14;
        boolean expected = false;
        boolean actual = Main.primeNumber(number);
        Assertions.assertEquals(expected, actual);
    }
}
