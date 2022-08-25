// write a program to make a function to print the table of a given number n.

import java.util.*;

public class TableFunction
{
    public static void printTable( int val )
    {
        for( int i=1 ; i<=10 ; i++ )
        {
            int mul=i*val;
            System.out.println(val+" x "+i+" = "+ mul);
        }
    }
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int val=Sc.nextInt();
        System.out.println();

        printTable( val );

    }
}