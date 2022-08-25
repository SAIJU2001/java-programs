// write a program to Print a palindromic number pyramid.
/*
            *
          * * *
        * * * * *
      * * * * * * *
        * * * * *
          * * *
            *
*/         

import java.util.*;

public class Pattern15
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
                for(int j=1; j<=2*i-1 ; j++) 
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for(int i=row; i>=1 ; i--) 
            {
                //spaces
                for(int j=1; j<=row-i ; j++) 
                {
                    System.out.print("  ");
                }
                //stars
                for(int j=1; j<=2*i-1 ; j++) 
                {
                    System.out.print("* ");
                }
                System.out.println();           
            }
    }
}