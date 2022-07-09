// write a program which converts decimal to binary taking user input.

import java.util.*;

public class decimal2binary
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the Decimal number : ");
        int decimal = Sc.nextInt();
        System.out.println();
        int binary=0,base=1,rem;
        int n = decimal;
        while( n!=0 )
        {
            rem = n%2; 
            binary = binary+rem*base;
            base = base*10;
            n = n/2;
        }
        System.out.print("The Binary equivalent of Decimal number "+decimal+" is : "+binary);
    }
}