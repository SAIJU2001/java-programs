// write a program to convert km to miles.

import java.util.*;

public class KmToMiles
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Press 1 for covert Km to miles.\nPress 2 for covert miles to Km.");
        int n=Sc.nextInt();
        int km,mile;
        switch(n)
        {
            case 1:
                System.out.print("Enter the km value : ");
                km=Sc.nextInt();
                System.out.print("The miles value : "+km*0.621371);
                break;
            case 2:
                System.out.print("Enter the miles value is : ");
                mile=Sc.nextInt();
                System.out.print("The km value is : "+mile*1.609344);
                break;
                default :
                System.out.print("Invalid number!!");
                break;

        }
    }
}