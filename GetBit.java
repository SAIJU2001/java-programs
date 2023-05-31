import java.util.*;

public class GetBit
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=Sc.nextInt();
        System.out.print("Enter the position : ");
        int pos=Sc.nextInt();
        System.out.print( "The bit is : "+getBit( num,pos) );
    }
    //get bit from any position
    public static int getBit( int num ,int pos )
    {
        int bitMask=1<<pos;
        if( (num & bitMask) ==0 )
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    
}