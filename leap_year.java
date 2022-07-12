// write a program to input year and check that the year is leap year or not.

import java.util.*;

public class leap_year
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = Sc.nextInt();
        System.out.println();
        if(year%400==0)
        System.out.print(year+" is a leap year."); 
        else if(year%100==0)
        System.out.print(year+" is not a leap year.");
        else if (year%4==0)
        System.out.print(year+" is a leap year.");
        else
        System.out.print(year+" is not a leap year.");
    }
}