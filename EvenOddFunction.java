// write a program to make a function to check if a given number n is even or not.


import java.util.*;

public class EvenOddFunction
{
    public static void checkEvenOdd( int val )
    {
        if( val==1 )
        {
            System.out.print("The value is an Odd number.");
            return;
        }
        if( val%2==0 )
        System.out.print("The value is an Even number.");   
        else
        System.out.print("The value is an Odd number.");
        
    }
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int val=Sc.nextInt();
        System.out.println();

        checkEvenOdd( val );

    }
}