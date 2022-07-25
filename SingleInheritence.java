// oops concept
// single level inheritence

import java.util.*;

// this is the base class or parent class
class Shape 
{
    public void area()
    {
        System.out.print("Display area of shape");
    }
}

// this is the child class or derived class
class Triangle extends Shape
{
    public void area()
    {
        System.out.print("Display area of triangle");
    }
}

public class SingleInheritence
{
    public static void main(String args[])
    {
        //creat the object of pen class
        Triangle T1 = new Triangle();
        T1.area();
    }
}
