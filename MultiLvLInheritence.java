// oops concept
// multi level inheritence

import java.util.*;

// this is the base class or parent class
class Shape 
{
    public void area()
    {
        System.out.println("Display area of shape.  ");
    }
}

// this is the child class or derived class
class Triangle extends Shape
{
    public void area()
    {
        System.out.println("Display area of triangle.  ");
    }
}

//derived class of a derived class
class EquilateralTriangle extends Triangle
{
    public void area()
    {
        System.out.println("Display area of Equilateral triangle. ");
    }
}

public class MultiLvLInheritence
{
    public static void main(String args[])
    {
        //creat the object of pen class
        Shape S1 = new Shape();
        S1.area();
        Triangle T1 = new Triangle();
        T1.area();
        EquilateralTriangle ET1 = new EquilateralTriangle();
        ET1.area();
    }
}
