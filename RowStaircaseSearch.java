import java.util.*;

public class RowStaircaseSearch
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the row length : ");
        int row=Sc.nextInt();
        System.out.print("Enter the col length : ");
        int col=Sc.nextInt();
        int matrix[][]=new int [row][col];

        for ( int i=0 ; i<row ; i++ )
        {
            for ( int j=0 ; j<col ; j++ )
            {
                System.out.print("Enter the value of index ("+i+","+j+") : ");
                matrix[i][j]=Sc.nextInt();
            }
        }
        System.out.print("Enter the key value : ");
        int key=Sc.nextInt();
        search(matrix,key );
    }
    public static boolean search( int matrix[][],int key )
    {
        int row=0;
        int col=matrix[0].length-1;

        while( row<matrix.length && col>=0)
        {
            if( matrix[row][col]==key )
            {
                System.out.print( "The value is find of the index : ("+row+","+col+")");
                return true;
            }
            else if( matrix[row][col]>key)
            {
                col--;
            }
            else
            {
                row++;
            }
        }
        return false;
    }
    
}