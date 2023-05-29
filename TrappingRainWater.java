//trapping rain water

import java.util.*;

public class TrappingRainWater
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the length of the height array : ");
        int length=Sc.nextInt();
        int height[]=new int [length];

        for( int i=0 ; i<length ; i++)
        {
            System.out.print("Enter the value of index "+i+" : ");
            height[i]=Sc.nextInt();
        }
        System.out.println("The quantity of trapped water is : "+ trappedWater(height));
    }
    public static int trappedWater( int height[])
    {
        int n=height.length;
        //calculate max left height using auxilary array
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for( int i=1 ; i<n ; i++ )
        {
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        //calculate max right height using auxilary array
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for( int i=n-2 ; i>=0 ; i-- )
        {
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }

        //calculate min of max left and right height
        int trappedWater=0;
        for( int i=0 ; i<n ; i++ )
        {
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
            trappedWater+=waterLevel-height[i];
        }
        return trappedWater;
    }   
}