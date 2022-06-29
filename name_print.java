//print the name with and without your surname.

import java.util.*;

public class name_print
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        System.out.println();
        String name = Sc.next();// for name only (without surname)
       // String name = Sc.nextLine();// for name with surname
        System.out.print(name);

    }
}