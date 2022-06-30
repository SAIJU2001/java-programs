//Enter any number and check that the no is amstrong or not.

import java.util.*;

public class amstrong
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = Sc.nextInt();
        System.out.println();
        int l=n;
        int count=0, mul=1, result=0, c=0,cnt,rem;
        while(l!=0)
        {
            l = l/10;
            count++;
        }
        cnt=count;
        l=n;
        while(l!=0)
        {
            rem=l%10;
            while(cnt!=0)
            {
                mul=mul*rem;
                cnt--;
            }
            result =result+mul;
            cnt=count;
            l=l/10;
            mul=1;
        }
        if(result==n)
        System.out.print("The number "+n+" is an amstrong number.");
        else
        System.out.print("The number "+n+" is not an amstrong number.");
    }
}
