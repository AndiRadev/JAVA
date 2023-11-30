import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        reverseArray();
    }

    public static int [] reverseArray()
    {
        Scanner sc = new Scanner(System.in);
        int count = 10;
        int arr[]= new int[count];

        for(int i=0; i<count; i++)
        {
            System.out.println("Enter element: ");
            int number = sc.nextInt();
            arr[i]=number;
        }

        int arrReverse[]=new int [count];

        int br=0;
        for(int i=count-1; i>=0; i--)
        {
            arrReverse[br] = arr[i];
            br++;
        }
        arr=arrReverse;
        return arr;
    }

    public static void printArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}