// write a program that reads 5x5 array of intiger and the prints the row sum and column sum.

import java.util.*;

public class sum_twoD_array
{
    public static void main(String args[])
    {  
        // 2D array input 
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the no of rows you want : ");
        int rows = Sc.nextInt();
        System.out.print("Enter the no of columns you want : ");
        int cols = Sc.nextInt();
        int numbers[][] = new int[rows][cols];
        System.out.println();
        for( int i=0 ; i<rows ; i++)
            {
                for( int j=0 ; j<cols ; j++)
                    {
                        System.out.print("Enter the value of "+i+"th row "+j+"th column is : ");
                        numbers[i][j] = Sc.nextInt();
                        System.out.println();
                    }
            }

        // array output row sum 
        int add = 0;
        for( int i=0 ; i<rows ; i++)
            {
                for( int j=0 ; j<cols ; j++) 
                add = add + numbers[i][j];
            }
        System.out.print("The value of the sum of rows is : "+add);
        System.out.println();
        System.out.println();

        // array output column sum
        int sum = 0; 
        for( int j=0 ; j<cols ; j++)
        {
            for( int i=0 ; i<rows ; i++)
            sum = sum + numbers[i][j];
        }
        System.out.print("The value of the sum of columns is : "+sum);
        System.out.println();
    }
}