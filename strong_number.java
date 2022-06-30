//input any no and check that it is strong number or not.
//it is a number in which the sum of factorial of individual digits of a number is equal to the original number.
//example : 145 = 1!+4!+5! = 1+24+120 = 145

import java.util.*;

public class strong_number
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = Sc.nextInt();
        System.out.println();
        int l=n,rem,result=0,fact=1;
        while(l!=0)
        {
            rem=l%10;  
            for(int i=rem ; i>=1 ; i--)
            {
                fact=fact*i;
            }
            result=result+fact;
            fact=1;
            l=l/10;
        }
        if(result==n)
        System.out.print("The number "+ n +" is a strong number.");
        else
        System.out.print("The number "+ n +" is not a strong number.");
    }
}