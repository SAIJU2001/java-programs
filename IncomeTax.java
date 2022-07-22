/*  write a program to calculate income tax paid by an employee to the government as the slot below.
        income slot         tax
        below 2.5L          0%
        2.5L-5.0L           5%
        5.0L-10.0L          10%
        above 10.0L         20%
*/

import java.util.*;

public class IncomeTax
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter your yearly salary : ");
        float salary = Sc.nextFloat();
        System.out.println();
        if( salary<250000 )
        {
            System.out.print("The amount of tax paid by the employee is : 0 Rs.");
        }
        else if( salary>250000 && salary<=500000 )
        {
            float tax = salary*5/100;
            System.out.print("The amount of tax paid by the employee is : "+tax+" Rs.");
        }
        else if( salary>500000 && salary<=1000000 )
        {
            float tax = salary*10/100;
            System.out.print("The amount of tax paid by the employee is : "+tax+" Rs.");
        }
        else if( salary>1000000 )
        {
            float tax = salary*20/100; 
            System.out.print("The amount of tax paid by the employee is : "+tax+" Rs.");
        }
    }
}