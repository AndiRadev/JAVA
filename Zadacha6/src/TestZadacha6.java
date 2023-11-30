import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;
public class TestZadacha6
{
    @Test
    public void testPrintTriangleMethod()
    {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stream));

        Main.printTriangle(3);
        System.setOut(System.out);

        String expected = "*\n**\n***\n";
        Assertions.assertEquals(expected, stream.toString());
    }
}