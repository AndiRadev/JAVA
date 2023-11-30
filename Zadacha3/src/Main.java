// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        int [] arr = {1, 2, 3, 4, 5};
        System.out.println(maxAndMinElementsOfArray(arr));
    }

    public static String maxAndMinElementsOfArray(int []arr)
    {
        int max=arr[0];
        int min=arr[0];

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }

            if(arr[i]<min)
            {
                min=arr[i];
            }
        }

        return"Max= " + max + " Min= " + min;
    }
}