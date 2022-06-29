//print the pattern

//    * * * *
//    * * *
//    * * 
//    * 


import java.util.*;

public class pattern_Q5
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the no of rows : ");
        int n = Sc.nextInt();
        System.out.println();
        for( int i=1 ; i<=n ; i++)
        {
            for(int j=n ; j>=i ; j--)
            System.out.print(" *");
            System.out.println();
        }
    }
}