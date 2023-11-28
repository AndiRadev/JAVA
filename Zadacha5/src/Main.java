import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        int arr[][] = enterArray();
        System.out.println("Sum: " + sumOfDiagonalsWithoutSecondCenter(arr,arr.length));
        System.out.println("All sum: " + sumOfDiagonals(arr,arr.length));

    }

    public static int [][] enterArray()
    {
        Scanner sc = new Scanner(System.in);
        int matrix [][] = new int [3][3];

        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.println("Enter element: ");
                int number = sc.nextInt();
                matrix[i][j] = number;
            }
        }
        return matrix;
    }

    public static int sumOfDiagonalsWithoutSecondCenter(int [][]matrix, int n)
    {
        int sum=0;
        int centerElement = matrix[n/2][n/2];

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==j)
                {
                    sum+=matrix[i][j];
                }

                if((i+j)==(n-1))
                {
                    if(matrix[i][j]!=centerElement)
                    {
                        sum += matrix[i][j];
                    }
                }
            }
        }
        return sum;
    }

    public static int sumOfDiagonals(int [][]matrix, int n)
    {
        int sum=0;

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==j)
                {
                    sum+=matrix[i][j];
                }

                if((i+j)==(n-1))
                {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
}