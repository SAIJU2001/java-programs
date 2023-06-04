import java.util.*;

public class CheckSquareNumber
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=Sc.nextInt();
        if( checkNum( num)==true )
        {
            System.out.print( "The number is a square number or power of 2" );
        }
        else
        {
            System.out.print( "The number is not a square number or power of 2");
        }
    }
    //if the no is square no => n & (n-1)=0
    public static boolean checkNum( int num )
    {
        return (num & (num-1))==0;
    }   
}