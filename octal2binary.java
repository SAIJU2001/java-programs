// write a program which converts octal to binary taking user input.

import java.util.*;

public class octal2binary
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the octal number : ");
        int octal = Sc.nextInt();
        System.out.println();
        int l=0,binary=0,base=1,rem,decimal=0;
        int n = octal;
        while( n!=0 )
        {
            rem = n%10; 
            if( rem==8 || rem==9 )
            {
                System.out.print("It is not a valid octal number");
                System.out.println();
                l=l+1;
                break;
            }
            else
            {
                decimal = decimal+rem*base;
                base = base*8;
                n = n/10;
            }
        }
        int m = decimal;
        base = 1; 
        while( m!=0 )
        {
            rem = m%2; 
            binary = binary+rem*base;
            base = base*10;
            m = m/2;
        }
        if(l==0)
        System.out.print("The binary equivalent of octal number "+octal+" is : "+binary);
    }
}