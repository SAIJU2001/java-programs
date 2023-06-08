import java.util.*;

public class EvenOddUsingBitMask
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=Sc.nextInt();
        if( checkNum( num)==0 )
        {
            System.out.print( "The number is even" );
        }
        else
        {
            System.out.print( "The number is odd");
        }
    }
    //if the LSB is 1 no is odd if 0 the no is even
    public static int checkNum( int num )
    {
        return (num & 1);
    }   
}