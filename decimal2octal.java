// write a program which converts decimal to octal taking user input.

import java.util.*;

public class decimal2octal
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the Decimal number : ");
        int decimal = Sc.nextInt();
        System.out.println();
        int octal=0,base=1,rem;
        int n = decimal;
        while( n!=0 )
        {
            rem = n%8; 
            octal = octal+rem*base;
            base = base*10;
            n = n/8;
        }
        System.out.print("The octal equivalent of Decimal number "+decimal+" is : "+octal);
    }
}