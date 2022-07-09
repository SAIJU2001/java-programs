// write a program which converts octal to decimal taking user input.

import java.util.*;

public class octal2decimal
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the octal number : ");
        int octal = Sc.nextInt();
        System.out.println();
        int decimal=0,base=1,rem;
        int n = octal;
        while( n!=0 )
        {
            rem = n%10; 
            decimal = decimal+rem*base;
            base = base*8;
            n = n/10;
        }
        System.out.print("The decimal equivalent of octal number "+octal+" is : "+decimal);
    }
}