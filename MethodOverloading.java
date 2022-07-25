// oops concept
//compile time polymorphism

import java.util.*;

// this is the class or blue print
class Student
{
    //properties of the class
    String name;
    int roll;

    //same name function is present in the class it is called method overloading
    public void printInfo(String name)
    {
        System.out.println(name);
    }
    public void printInfo(int roll)
    {
        System.out.println(roll);
    }
    public void printInfo(String name , int roll)
    {
        System.out.println(name+" "+roll);
    }
}

public class MethodOverloading
{
    public static void main(String args[])
    {
        //creat the object of pen class
        Student s1 = new Student();
        s1.name="saikat";
        s1.roll=01;

        Student s2 = new Student();
        s2.name="sweety";
        s2.roll=02;
        
        s1.printInfo(s1.name);
        s2.printInfo(s2.roll);
        s2.printInfo(s2.name,s2.roll);

    }
}
