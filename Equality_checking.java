//Input two nos and check they are equal or not.


import java.util.*;
    public class Equality_checking
    {
        public static void main(String args[])
        {
            Scanner Sc = new Scanner(System.in);
            System.out.print("Enter the first no = ");
            int a = Sc.nextInt();
            System.out.println();
            System.out.print("Enter the second no = ");
            int b = Sc.nextInt();
            System.out.println();
            if(a==b)
            System.out.println("Two nos are Equal.");
            else
            System.out.println("Two nos are not Equal.");
        }
    }