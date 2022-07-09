// write a program for fibonacci series taking user input.

import java.util.*;

public class fibonacci_series
{
    public static void main(String args[])
    {
        
        int a=0,b=1,result;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = Sc.nextInt();
        System.out.println();
        System.out.print("The fibonacci series is : ");
        for( int i=1 ; i<=n ; i++ )
        {
            System.out.print(a+" ");
            result = a+b;
            a = b;
            b = result;
        }
    }
}