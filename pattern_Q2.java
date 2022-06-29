//print the pattern

//    * * * * *
//    * * * * *
//    * * * * *
//    * * * * *


import java.util.*;

public class pattern_Q2
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
                System.out.print(" *");    
            }
        System.out.println();
        }
    }
}