import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

public class TestZadacha5
{
    @AfterEach
            public void print()
    {
        System.out.println("Test finished !");
    }
    int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    @Test
    public void testEnterArrayMethod()
    {
        String input = "1\n2\n3\n4\n5\n6\n7\n8\n9\n";

        InputStream inp = new ByteArrayInputStream(input.getBytes());
        System.setIn(inp);

        int arrResult[][] = Main.enterArray();
        //System(in);

        Assert.assertArrayEquals("Array are not entered corectly !", matrix, arrResult);
        print();
    }

    @Test
    public void testSumOfDiagonalsMethod()
    {
        int expectedSum = 30;
        int resultSum = Main.sumOfDiagonals(matrix, matrix.length);
        Assertions.assertEquals(expectedSum, resultSum, "Sum is not valid !");
        print();
    }

    @Test
    public void testSumOfDiagonalWithoutSecondCenterElement()
    {
        int expectedSum = 25;
        int resultSum = Main.sumOfDiagonalsWithoutSecondCenter(matrix, matrix.length);
        Assertions.assertEquals(expectedSum, resultSum, "Sum is not valid !");
        print();
    }
}
