//find the factorial of a given number.

import java.util.Scanner;

public class function_factorial
{
    public static int factorial(int num)
    {
        int fact=1;
        for(int i=num ; i>=1 ; i--)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = Sc.nextInt();
        System.out.println();
        int fact = factorial(num);
        System.out.print("The factorial of "+ num +" is "+fact);
    }
}