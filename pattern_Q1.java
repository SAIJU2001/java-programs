//print the pattern

//    *
//    *
//    *
//    *
//    *

import java.util.*;

public class pattern_Q1
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the no of row : ");
        int n = Sc.nextInt();
        System.out.println();
        for( int i=1 ; i<=n ; i++)
        {
            System.out.print("*");
            System.out.println(); 
        }
    }
}
