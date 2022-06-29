import java.util.*;

public class Arithmetic_operation
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the first no = ");
        int a = Sc.nextInt();
        System.out.println();
        System.out.print("Enter the Second no = ");
        int b = Sc.nextInt();
        System.out.println();
        System.out.print("The Addition of these two nos are = ");
        System.out.println(a+b);
        System.out.print("The Subtraction of these two nos are = ");
        System.out.println(a-b);
        System.out.print("The Division of these two nos are = ");
        System.out.println(a/b);
        System.out.print("The Multiplication of these two nos are = ");
        System.out.println(a*b);
        System.out.print("The Modulous of these two nos are = ");
        System.out.println(a%b);
    }
}