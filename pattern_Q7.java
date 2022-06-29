//print the pattern

//    1
//    1 2
//    1 2 3
//    1 2 3 4
//    1 2 3 4 5


import java.util.*;

public class pattern_Q7 
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the no of rows : ");
        int n = Sc.nextInt();
        System.out.println();
        for( int i=1 ; i<=n ; i++)
        {
            for(int j=1 ; j<=i ;j++)
            {
                System.out.print(j);
                System.out.print(" ");    
            }
        System.out.println();
        }
    }
}    