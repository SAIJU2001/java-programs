//buy & sell Stock

import java.util.*;

public class BuyAndSellStock
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the length of the price array : ");
        int n=Sc.nextInt();
        int prices[]=new int[n];
        for( int i=0 ; i<n ; i++ )
        {
            System.out.print("Enter the value of index "+i+" : ");
            prices[i]=Sc.nextInt();
        }
        System.out.print(maxprofit( prices ));
    }
    public static int maxprofit( int prices[] )
    {
        int maxProfit=0;
        int buyStock=Integer.MAX_VALUE;
        for( int i=0 ; i<prices.length ; i++ )
        {
            if( buyStock<prices[i])
            {
                maxProfit=Math.max(maxProfit,prices[i]-buyStock);
            }
            else
            {
                buyStock=prices[i];
            }
        }
        return maxProfit;
    }
}