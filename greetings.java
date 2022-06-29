//write a java program which asks the user his/her name and 
//greets them with hello <name> have a good day.

import java.util.*;

public class greetings 
{
    public static void main(String args[])
    {
        Scanner Sc = new Scaneer(System.in);
        System.out.print("Enter your name : ");
        String name = Sc.nextLine();
        System.out.println();
        System.out.print("Hello"+ name +"have a good day");

    }
}