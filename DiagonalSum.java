import java.util.*;

public class DiagonalSum
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the row length : ");
        int row=Sc.nextInt();
        System.out.print("Enter the col length : ");
        int col=Sc.nextInt();
        int matrix[][]=new int [row][col];

        for ( int i=0 ; i<row ; i++)
        {
            for ( int j=0 ; j<col ; j++ )
            {
                System.out.print("Enter the value of index ("+i+","+j+") : ");
                matrix[i][j]=Sc.nextInt();
            }
        }
        System.out.print(findSum(matrix ));
    }
    public static int findSum( int matrix[][] )
    {
        int sum=0;
        for( int i=0 ; i<matrix.length ; i++ )
        {
            sum+=matrix[i][i];

            if( i!=matrix.length-1-i )
            {
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
    
}