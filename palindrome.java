//Enter any no and check that the no is palindrome or not.

import java.util.*;

public class palindrome
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = Sc.nextInt();
        System.out.println();
        int n = x;
        int r = 0;
        while(n!=0)
        {
            int a = n%10;
            r = r*10+a;
            n = n/10;
        }    
            if(x == r)
            {
                System.out.print("The number "+x+" is a palindrome number");
            }
            else
            {
                System.out.print("The number "+x+" is not a palindrome number");
            }
    }
}