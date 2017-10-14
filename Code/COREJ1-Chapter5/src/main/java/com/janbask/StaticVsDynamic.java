package com.janbask;

/*
 * Method overloading is one of the way java supports static polymorphism.
 * Here we have two definitions of the same method add() which add method would be called is determined by the parameter list at the compile time.
 * That is the reason this is also known as compile time polymorphism.
* */
class SimpleCalculator
{
    int add(int a, int b)
    {
        return a+b;
    }
    int  add(int a, int b, int c)
    {
        return a+b+c;
    }
}

/*
 * In this example we have two classes ABC and XYZ. ABC is a parent class and XYZ is a child class.
 * The child class is overriding the method myMethod() of parent class.
 * In this example we have child class object assigned to the parent class reference so in order to determine which method would be called,
 * the type of the object would be determined at run-time.
 * It is the type of object that determines which version of the method would be called (not the type of reference).
* */
class ABC{
    public void myMethod(){
        System.out.println("Overridden Method");
    }
}

class XYZ extends ABC {

    public void myMethod() {
        System.out.println("Overriding Method");
    }
}

public class StaticVsDynamic {
    public static void main(String args[])
    {
        //Static
        SimpleCalculator obj = new SimpleCalculator();
        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10, 20, 30));

        //Dynamic
        ABC dynamicObj1 = new XYZ();
        ABC dynamicObj2 = new ABC();
        dynamicObj1.myMethod();
        dynamicObj2.myMethod();

        /* Few more overriding examples:
        ABC obj = new ABC();
        obj.myMethod();
        //This would call the myMethod() of parent class ABC

        XYZ obj = new XYZ();
        obj.myMethod();
        //This would call the myMethod() of child class XYZ

        ABC obj = new XYZ();
        obj.myMethod();
        //This would call the myMethod() of child class XYZ
        */
    }
}
