/*  write a program to Print a hollow Rhombus.
            *****
           *   *
          *   *
         *   *
        *****
*/

import java.util.*;

public class Pattern19
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
                for(int j=1; j<=row-i; j++) 
                {
                    System.out.print("  ");
                }
                //stars
                for(int j=1; j<=row ; j++) 
                {
                    if( i==1 || j==1 || i==row || j==row )
                    System.out.print("* ");
                    else
                    System.out.print("  ");
                }
                
                System.out.println();
            }
            
    }
}
