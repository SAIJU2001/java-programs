import java.util.*;

public class FastExponentiation
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=Sc.nextInt();
        System.out.print("Enter the power : ");
        int power=Sc.nextInt();
        System.out.print( "The number is : "+exponent(num,power) );
    }
    //the time complexity of this process is O(log n)
    public static int exponent( int num,int power )
    {
        int ans=1;
        while( power>0 )
        {
            if( (power & 1)==1 )
            {
                ans=ans*num;
            }
            num*=num;
            power=power>>1;
        }
        return ans;
    }   
}