//print the multiplucation table of any number.

import java.util.*;

public class multiplication_table
{
    public static void main(String args[])
    {
        int mul=0;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = Sc.nextInt();
        System.out.println();
        for(int i=1 ; i<=10 ; i++)
        {
            mul=n*i;
            System.out.print(n);
            System.out.print(" X ");
            System.out.print(i);
            System.out.print(" = ");
            System.out.print(mul);
            System.out.println();
        }
        

    }
}