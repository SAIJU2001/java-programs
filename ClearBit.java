import java.util.*;

public class ClearBit
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=Sc.nextInt();
        System.out.print("Enter the position where to clear the bit: ");
        int pos=Sc.nextInt();
        System.out.print( "After clear the bit the number is : "+clearBit( num,pos) );
    }
    //clear bit from any position
    public static int clearBit( int num ,int pos )
    {
        int bitMask=~(1<<pos);
        return (num & bitMask);
    }   
}