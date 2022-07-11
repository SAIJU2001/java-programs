//input any no and check that the no is prime or not.

import java.util.*;

public class prime_number
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = Sc.nextInt();
        System.out.println();
        int m=n;
        int count=0;
        for( int i=2 ; i<n ; i++ )
	    {
		    if(n%i==0)
		    count++;
	    }
	    if( count==0 && m!=1 && m!=2 )
	    System.out.print("The number "+m+" is a prime number.");
	    else
	    System.out.print("The number "+m+" is not a prime number.");
    }
}
	
	