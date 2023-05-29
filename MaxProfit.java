//best time to buy and sell stock
import java.util.*;

public class MaxProfit
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the length of the stock array : ");
        int length=Sc.nextInt();
        int stock[]=new int [length];

        for ( int i=0 ; i<length ; i++)
        {
            System.out.print("Enter the value of index "+i+" : ");
            stock[i]=Sc.nextInt();
        }
        System.out.print( calculateProfit( stock) );
    }
    public static int calculateProfit( int stock[])
    {
        int buyStock=stock[0];
        int maxProfit=Integer.MIN_VALUE;

        for( int i=1 ; i<stock.length ; i++ )
        {
            if( buyStock>stock[i] )
            {
                buyStock=stock[i];
            }
            else
            {
                maxProfit=Math.max(maxProfit,stock[i]-buyStock);
            }
        }
        return maxProfit;
    }   
}