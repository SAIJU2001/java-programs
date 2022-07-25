// oops concept

import java.util.*;

// this is the class or blue print
class Animal 
{
    //properties of the class
    String color;
    String name;

    //function of the class
     public void print()
     {
         System.out.println("This is the function of class");
         System.out.println("The color of the pen : "+this.color);
         System.out.println("The type of the pen : "+this.name);
         System.out.println();
     }

    //non parameterzied constructor
    Animal()   //don't have any return type
    {
        System.out.println("non parameterzied constructor called.");
    }
}

public class NonParameterizedConstructor
{
    public static void main(String args[])
    {
        //creat the object of Animal class
        Animal A1 = new Animal();
        A1.color="brown";
        A1.name="cow";

        Animal A2 = new Animal();
        A2.color="black";
        A2.name="dog";
        
        A1.print();
        A2.print();
    }
}
