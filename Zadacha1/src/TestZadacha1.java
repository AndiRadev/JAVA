//import com.sun.tools.javac.Main;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.platform.commons.function.Try;

import java.awt.im.spi.InputMethod;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;
public class TestZadacha1
{
    int[] arr = {1, 2, 3, 4, 5};

    @Test
    public void testEnterElements()
    {
        String input = "1\n2\n3\n4\n5\n";
        InputStream input1 = new ByteArrayInputStream(input.getBytes());
        System.setIn(input1);

        int[] arr2 = Main.enterArray();

        System.setIn(System.in);

        Assertions.assertArrayEquals(arr, arr2, "Arrays are not equal! Not correct input !");
    }

    @Test
    public void testSumOfElementsValidSum()
    {
        int sumExpected = 15;
        int sumResult = Main.sumOfElements(arr);
        Assert.assertEquals(sumExpected, sumResult);
    }

    /*@Test
    public void testSumOfElementsNotExpectedSum()
    {
        int sumExpected = 10;
        int sumResult = Main.sumOfElements(arr);
        Assert.assertNotEquals(sumExpected, sumResult);
    }*/

    @Test
    public void testSumOfEvenElementsValidSum()
    {
        int sumExpected = 6;
        int sumResult = Main.sumOfEvenElements(arr);
        Assert.assertEquals(sumExpected, sumResult);
    }

    @Test
    public void testSumOfOddElementsValidSum()
    {
        int sumExpected = 9;
        int sumResult = Main.sumOfOddElements(arr);
        Assert.assertEquals(sumExpected, sumResult);
    }
}
