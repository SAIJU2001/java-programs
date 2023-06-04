import java.util.*;

public class ClearBitInRange
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=Sc.nextInt();
        System.out.print("Enter the start position : ");
        int pos1=Sc.nextInt();
        System.out.print("Enter the end position : ");
        int pos2=Sc.nextInt();
        System.out.print( "After clear the bits the number is : "+clearBit( num,pos1,pos2) );
    }
    //clear bit from any position
    public static int clearBit( int num ,int pos1,int pos2 )
    {
        int bitMask1=(~0)<<pos1;
        int bitMask2=(1<<pos2)-1;
        int bitMask=bitMask1+bitMask2;
        return (num & bitMask);
    }   
}