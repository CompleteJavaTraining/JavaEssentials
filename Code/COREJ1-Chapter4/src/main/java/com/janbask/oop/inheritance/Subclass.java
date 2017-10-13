package com.janbask.oop.inheritance;
/*
 * If a class is inheriting the properties of another class, the subclass automatically acquires the default constructor of the superclass.
 * But if you want to call a parameterized constructor of the superclass, you need to use the super keyword as shown below.
* */
class Superclass {

    /*
     * The program given in this section demonstrates how to use the super keyword to invoke the parametrized constructor of the superclass.
     * This program contains a superclass and a subclass, where the superclass contains a parameterized constructor which accepts a string value,
     * and we used the super keyword to invoke the parameterized constructor of the superclass.
    * */

    int age;

    Superclass(int age) {
        this.age = age;
    }

    public void getAge() {
        System.out.println("The value of the variable named age in super class is: " +age);
    }
}

public class Subclass extends Superclass {
    Subclass(int age) {
        super(age);
    }

    public static void main(String argd[]) {
        Subclass s = new Subclass(24);
        s.getAge();
    }
}