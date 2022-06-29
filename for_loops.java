//print 0 to 100

import java.util.*;

public class for_loops
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the last no : ");
        int n = Sc.nextInt();
        for(int i=0 ; i<=n ; i++)
        {
            System.out.print(i);
            System.out.print("  ");
        }
    }    
}