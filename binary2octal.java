// write a program which converts binary to octal taking user input.

import java.util.*;

public class binary2octal
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the Binary number : ");
        int binary = Sc.nextInt();
        System.out.println();
        int octal=0,base=1,rem,decimal=0;
        int n = binary;
        while( n!=0 )
        {
            rem = n%10; 
            decimal = decimal+rem*base;
            base = base*2;
            n = n/10;
            
        }
        int m = decimal;
        base = 1; 
        while( m!=0 )
        {
            rem = m%8; 
            octal = octal+rem*base;
            base = base*10;
            m = m/8;
        }
        System.out.print("The octal equivalent of binary number "+binary+" is : "+octal);
    }
}