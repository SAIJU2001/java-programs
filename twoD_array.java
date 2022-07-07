// input a 2D array and print the array in the 2D format(matrix),

import java.util.*;

public class twoD_array
{
    public static void main(String args[])
    {  
        // 2D array input 
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the no of rows you want : ");
        int rows = Sc.nextInt();
        System.out.println();
        System.out.print("Enter the no of columns you want : ");
        int cols = Sc.nextInt();
        System.out.println();
        int numbers[][] = new int[rows][cols];
        System.out.println();
        for( int i=0 ; i<rows ; i++)
            {
                for( int j=0 ; j<cols ; j++ )
                {
                    System.out.print("Enter the value of "+i+"th row "+j+"th column is : ");
                    numbers[i][j] = Sc.nextInt();
                }
                System.out.println();
            }

        // 2D array output
        for( int i=0 ; i<rows ; i++)
            {
                for( int j=0 ; j<cols ; j++ )
                {
                    System.out.print(numbers[i][j]+" ");
                }
                System.out.println();
            }
    }
}