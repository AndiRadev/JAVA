import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class TestZadacha3
{
    @Test
    public void testMaxAndMinElementsOfArray()
    {
        int arr[] ={1, 2, 3, 4, 5};
        String result = "Max= 5 Min= 1";
        int expectedSum = 6;
        String expected = Main.maxAndMinElementsOfArray(arr);

        Assertions.assertEquals(expected, result);
    }
}
