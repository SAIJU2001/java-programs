//print the pattern

//    * * * * *
//    *       *
//    *       *
//    * * * * *


import java.util.*;

public class pattern_Q3
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the no of rows : ");
        int n = Sc.nextInt();
        System.out.println();
        System.out.print("Enter the no of columns : ");
        int l = Sc.nextInt();
        System.out.println();
        for( int i=1 ; i<=n ; i++)
        {
            for(int j=1 ; j<=l ;j++)
            {
                if(i==1 || j==1 || i==n || j==l)
                System.out.print(" *");
                else 
                System.out.print("  ");    
            }
        System.out.println();
        }
    }
}