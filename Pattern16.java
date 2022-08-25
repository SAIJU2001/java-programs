/*  write a program to a Print half Pyramid.
                1
               1 2
              1 2 3
             1 2 3 4
            1 2 3 4 5
*/

import java.util.*;

public class Pattern16
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the no of rows : ");
        int row=Sc.nextInt();
        System.out.println();
       
            for(int i=1; i<=row ; i++) 
            {
                //spaces
                for(int j=1; j<=row-i ; j++) 
                {
                    System.out.print(" ");
                }

                //stars
                for(int j=1; j<=i ; j++) 
                {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
            
    }
}
