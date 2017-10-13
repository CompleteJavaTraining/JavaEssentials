package com.janbask.oop.Polymorphism;

public abstract class Employee {
    /*
     * Abstraction
     * A class which contains the abstract keyword in its declaration is known as abstract class.
     * Abstract classes may or may not contain abstract methods, i.e., methods without body ( public void get(); )
     * But, if a class has at least one abstract method, then the class must be declared abstract.
     * If a class is declared abstract, it cannot be instantiated.
     * To use an abstract class, you have to inherit it from another class, provide implementations to the abstract methods in it.
     * If you inherit an abstract class, you have to provide implementations to all the abstract methods in it.
    * */

    /*
     * Polymorphism
     * In this section, we will also see the behavior of overridden methods in Java allows you to take advantage of polymorphism when designing your classes.
     * We already have discussed method overriding, where a child class can override a method in its parent.
     * An overridden method is essentially hidden in the parent class, and is not invoked unless the child class uses the super keyword within the overriding method.
    * */
    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number) {
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public abstract double computePay();

    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }

    public String toString() {
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public int getNumber() {
        return number;
    }

    public abstract void computeTaxes();
}
