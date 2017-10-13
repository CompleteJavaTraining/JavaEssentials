package com.janbask.oop.inheritance;

/*
 * The super keyword is similar to this keyword. Following are the scenarios where the super keyword is used.
    * It is used to differentiate the members of superclass from the members of subclass, if they have same names.
    * It is used to invoke the superclass constructor from subclass.
 *******************************************************************
 * Differentiating the Members
 *******************************************************************
 * If a class is inheriting the properties of another class.
 * And if the members of the superclass have the names same as the sub class, to differentiate these variables we use super keyword as shown below.
* */

class Super_class {

    /*
     * In the given program, you have two classes namely Sub_class and Super_class,
     * both have a method named display() with different implementations, and a variable named num with different values.
     * We are invoking display() method of both classes and printing the value of the variable num of both classes.
     * Here you can observe that we have used super keyword to differentiate the members of superclass from subclass.
    * */

    int num = 20;

    // display method of superclass
    public void display() {
        System.out.println("This is the display method of superclass");
    }
}

public class Sub_class extends Super_class {
    int num = 10;

    // display method of sub class
    public void display() {
        System.out.println("This is the display method of subclass");
    }

    public void my_method() {
        // Instantiating subclass
        Sub_class sub = new Sub_class();

        // Invoking the display() method of sub class
        sub.display();

        // Invoking the display() method of superclass
        super.display();

        // printing the value of variable num of subclass
        System.out.println("value of the variable named num in sub class:"+ sub.num);

        // printing the value of variable num of superclass
        System.out.println("value of the variable named num in super class:"+ super.num);
    }

    public static void main(String args[]) {
        Sub_class obj = new Sub_class();
        obj.my_method();

        /* OUTPUT:
         * This is the display method of subclass
         * This is the display method of superclass
         * value of the variable named num in sub class:10
         * value of the variable named num in super class:20
        * */
    }
}
