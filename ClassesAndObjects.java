// oops concept

import java.util.*;

// this is the class or blue print
class Pen 
{
    //properties of the class
    String color;
    String type;
    String company;

    //function of the class
    public void print()
    {
        System.out.println("This is the function of class");
        System.out.println("The color of the pen : "+this.color);
        System.out.println("The type of the pen : "+this.type);
        System.out.println("The company of the pen : "+this.company);
        System.out.println();
    }
}

public class ClassesAndObjects
{
    public static void main(String args[])
    {
        //creat the object of pen class
        Pen pen1 = new Pen();
        pen1.color="ball pen";
        pen1.color="blue";
        pen1.company="Fort";

        Pen pen2 = new Pen();
        pen2.color="gel pen";
        pen2.color="black";
        pen2.company="supra";
        
        pen1.print();
        pen2.print();
    }
}
