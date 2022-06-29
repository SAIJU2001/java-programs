//print the pattern

//    1
//    2  3
//    4  5  6 
//    7  8  9  10
//    11 12 13 14 15


import java.util.*;

public class pattern_Q9 
{
    public static void main(String args[])
    {
        int num=1;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the no of rows : ");
        int n = Sc.nextInt();
        System.out.println();
        for( int i=1 ; i<=n ; i++)
        {
            for(int j=1 ; j<=i ;j++)
            {
                System.out.print(num);
                System.out.print("  ");
                num = num+1;      
            }
         System.out.println();
        }
    }
}    