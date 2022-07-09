// write a program which converts binary to decimal taking user input.

import java.util.*;

public class binary2decimal
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the binary number : ");
        int binary = Sc.nextInt();
        System.out.println();
        int decimal=0,base=1,rem;
        int n = binary;
        while( n!=0 )
        {
            rem = n%10; 
            decimal = decimal+rem*base;
            base = base*2;
            n = n/10;
        }
        System.out.print("The decimal equivalent of binary number "+binary+" is : "+decimal);
    }
}