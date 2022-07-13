//make a function to multiply two numbers

import java.util.*;

public class multiply_function
{
    public static float num1,num2;
    public static float multiply()
    {
        float mul=num1*num2;
        return mul;
    }
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        num1 = Sc.nextFloat();
        System.out.println();
        System.out.print("Enter the second number : ");
        num2 = Sc.nextFloat();
        System.out.println();
        float mul=multiply();
        System.out.print("The product of "+num1+" X "+num2+" is : "+mul);
     }
    
}