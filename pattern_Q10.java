//print the pattern

//    1
//    0 1
//    1 0 1
//    0 1 0 1
//    1 0 1 0 1


import java.util.*;

public class pattern_Q10 
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
                if((i+j)%2==0)
                {   
                    System.out.print(1);
                    System.out.print(" ");
                }    
                else
                {
                    System.out.print(0);
                    System.out.print(" ");
                }        
            }
        System.out.println();
        }
    }
}    