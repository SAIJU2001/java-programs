/*  write a program to Print a hollow Butterfly.
            *             *
            * *         * *
            *   *     *   *
            *     * *     *
            *     * *     *
            *   *     *   *
            * *         * *
            *             *
*/

import java.util.*;

public class Pattern20
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the no of rows : ");
        int row=Sc.nextInt();
        System.out.println();

        //upper half
            for(int i=1; i<=row ; i++) 
            {
                //star
                for(int j=1; j<=i; j++) 
                {
                    if( i==1 || j==1 || j==i )
                    System.out.print("* ");
                    else
                    System.out.print("  ");
                }
                //space
                for(int j=1; j<=2*(row-i) ; j++) 
                {
                    System.out.print("  ");
                }
                //star
                for(int j=1; j<=i ; j++) 
                {
                    if( i==1 || j==1 || j==i )
                    System.out.print("* ");
                    else
                    System.out.print("  ");
                }
                System.out.println();           
            }

            //lower half
            for(int i=row; i>=1 ; i--) 
            {
                //star
                for(int j=1; j<=i; j++) 
                {
                    if( i==1 || j==1 || j==i )
                    System.out.print("* ");
                    else
                    System.out.print("  ");
                }
                //space
                for(int j=1; j<=2*(row-i) ; j++) 
                {
                    System.out.print("  ");
                }
                //star
                for(int j=1; j<=i ; j++) 
                {
                    if( i==1 || j==1 || j==i )
                    System.out.print("* ");
                    else
                    System.out.print("  ");
                }
                System.out.println();           
            }
    }
}

