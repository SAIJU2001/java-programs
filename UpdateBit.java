import java.util.*;

public class UpdateBit
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=Sc.nextInt();
        System.out.print("Enter the position where to update the bit : ");
        int pos=Sc.nextInt();
        System.out.print("Enter the update bit : ");
        int newBit=Sc.nextInt();
        System.out.print( "After update the bit the number is : "+updateBit( num,pos,newBit) );
    }
    //update the bit from any position
    public static int updateBit( int num, int pos, int newBit )
    {
        int ans=0;
        if( newBit==0 )
        {
            ans=clearBit( num ,pos );
        }
        else
        {
            ans=setBit( num ,pos );
        }
        return ans;
    }

    //clear bit from any position
    public static int clearBit( int num ,int pos )
    {
        int bitMask=~(1<<pos);
        return (num & bitMask);
    }
        //Set bit into any position
    public static int setBit( int num ,int pos )
    {
        int bitMask=1<<pos;
        return (num | bitMask);
    }     
}