//make a function to perform sumation two numbers

import java.util.*;

public class division_function
{
    public static float num1,num2;
    public static float division()
    {
        float div=num1/num2;
        return div;
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
        float div = division();
        System.out.print("The division of "+num1+" / "+num2+" is "+div);

    }
    
}