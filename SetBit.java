import java.util.*;

public class SetBit
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=Sc.nextInt();
        System.out.print("Enter the position where to set the bit: ");
        int pos=Sc.nextInt();
        System.out.print( "After set the bit the number is : "+setBit( num,pos) );
    }
    //Set bit into any position
    public static int setBit( int num ,int pos )
    {
        int bitMask=1<<pos;
        return (num | bitMask);
    }   
}