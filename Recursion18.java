//print x to the power n(stack height log n)

import java.util.*;

public class Recursion18
{
    public static int print(int x,int n)
    {
        if(x==0)
        return 0;

        if(n==0)
        return 1;

        if(n%2==0)
        return print(x,n/2)*print(x,n/2);
        else
        return print(x,n/2)*print(x,n/2)*x;
    }
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x=Sc.nextInt();
        System.out.println();
        System.out.print("Enter the power : ");
        int n=Sc.nextInt();
        System.out.println();
        System.out.print("The result is : "+print(x,n));
    }
}