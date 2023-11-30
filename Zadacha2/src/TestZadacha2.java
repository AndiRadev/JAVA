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

public class TestZadacha2
{
    int [] arr ={10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
   @Test
    public void testReverseArrayReverseCorrect()
   {
       String input = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n";
       InputStream input1 = new ByteArrayInputStream(input.getBytes());
       System.setIn(input1);

       int [] arr2 = Main.reverseArray();

       System.setIn(System.in);

       Assertions.assertArrayEquals(arr, arr2, "Reverse array are not equal to original array(reversed)");
   }
}
