 //Enter any no and check that the no is even or odd.

import java.util.*;
public class even_odd
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the no = ");
        int a = Sc.nextInt();
        if(a%2==0)
        System.out.println("The no is even.");
        else
        System.out.println("The no is odd.");
    }
}