/*  write a program to Print Inverted Half Pyramid.
            1111
            222
            33
            4
*/

import java.util.*;

public class Pattern17
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the no of rows : ");
        int row=Sc.nextInt();
        System.out.println();
       
            for(int i=1; i<=row ; i++) 
            {               
                for(int j=1; j<=row-i+1; j++) 
                {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
    }
}
