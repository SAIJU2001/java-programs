// write a program to check the number is a perfect number or  not.

import java.util.*;

public class perfect_number
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = Sc.nextInt();
        System.out.println();
        int m=n;
        int sum=0;
        for( int i=1 ; i<m ; i++)
        {
            if( m%i==0 )
            sum=sum+i;
        }
        if( n==sum)
        System.out.print("The number "+n+" is a perfect number.");
        else
        System.out.print("The number "+n+" is not a perfect number.");
    }
}