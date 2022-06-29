//print 0 to 100 using do while loops 

import java.util.*;
public class do_while_loops
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the last no : ");
        int n = Sc.nextInt();
        System.out.println();
        int i=1;
        do
        {
            System.out.print(i);
            System.out.print("  ");
            i++;
        }while(i<=n);
    }
}