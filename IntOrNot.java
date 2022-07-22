// write a java program to detect whether the input of the user is integer or not.

import java.util.*;

public class IntOrNot
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        System.out.print(Sc.hasNextInt());
    }
}