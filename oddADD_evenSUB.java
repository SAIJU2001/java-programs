// write a program to print numbers from 1 to 10 in such a way that when number is odd,add 1 and when the number is even,subtract 1
// output be like 2 1 4 3 6 5 8 7 10 9

import java.util.*;

public class oddADD_evenSUB
{
    public static void main(String args[])
    {
        for( int i=1 ; i<=10 ; i++ )
        {
            if( i%2==0 )
            System.out.print( i-1 +" ");
            else
            System.out.print( i+1 +" ");
        }
    }
}