// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        //System.out.println(primeNumber(8));
    }

    public static boolean primeNumber(int n)
    {
        boolean isPrime=true;
        if(n<=1)
        {
            isPrime=false;
        }
        for(int i=2; i<n; i++)
        {
            if(n%i==0)
            {
                isPrime=false;
            }
        }
        return isPrime;
    }
}