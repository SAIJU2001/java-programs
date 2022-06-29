//Enter your Age and check that you are Adult or not.

import java.util.*;
    public class if_condition
    {
        public static void main(String args[])
        {
            Scanner Sc = new Scanner(System.in);
            System.out.print("Enter your age = ");
            int age = Sc.nextInt();
            if(age>=18)
            System.out.println("You are Adult.");
            else
            System.out.println("You are not Adult.");
        }
    }