import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
       enterArray();
    }

    public static int [] enterArray()
    {

        Scanner sc = new Scanner(System.in);
        int countOfElements=5;
        int arr[]=new int[countOfElements];
        for(int i=0; i<countOfElements; i++)
        {
            System.out.println("Enter element: ");
            int number = sc.nextInt();
            arr[i]=number;
        }
        return arr;
    }

    public static int sumOfElements(int arr[])
    {
        int sum=0;
        for(int i=0; i<arr.length; i++)
        {
            sum+=arr[i];
        }
        return sum;
    }

    public static int sumOfEvenElements(int arr[])
    {
        int sum=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%2==0)
            {
                sum+=arr[i];
            }
        }
        return sum;
    }

    public static int sumOfOddElements(int arr[])
    {
        int sum=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%2!=0)
            {
                sum+=arr[i];
            }
        }
        return sum;
    }
}