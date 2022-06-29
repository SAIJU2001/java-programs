//print the sum of first n natural number.

import java.util.*;
public class sum_natural_no
{

    public static void main(String args[])
    {
        int sum=0;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the last number : ");
        int n = Sc.nextInt();
        System.out.println();
        for(int i=1 ; i<=n ; i++)
        {
            sum=sum+i;
        }
        System.out.print(sum);

    }
}