package com.janbask;

//Difference No.1:
// Abstract class can extend only one class or one abstract class at a time.
class BaseClass{
    public void baseMethod1(){
        System.out.println("Base method 1 called");
    }

    public void baseMethod2(){
        System.out.println("Base method 2 called");
    }
}

abstract class OtherClass{
    public void OtherMethod(){
        System.out.println("Other method called");
    }
}

abstract class AbstractClass1 extends BaseClass{
    public void simpleMethod(){
        System.out.println("Method called on AbstractClass1");
    }

    public abstract void abstractMethod();
}

abstract class AbstractClass2 extends OtherClass{
    abstract void someMethod();
}

class ConcreteClass1 extends  AbstractClass1{
    @Override
    public void abstractMethod(){
        System.out.println("Concrete Implementation of abstractMethod!");
    }
}

class ConcreteClass2 extends  AbstractClass2{
    @Override
    void someMethod() {
        System.out.println("Concrete Implementation of someMethod!");
    }
}

// Interface can extend any number of interfaces at a time. A class can implement any number of interfaces
//first interface
interface Interface1{
    public void display1();
}
//second interface
interface Interface2 {
    public void display2();
}
//This interface is extending both the above interfaces
interface Interface3 extends Interface1,Interface2{
    public void display3();
}

interface Interface4{
    public void display4();
}

class Implementer implements Interface3, Interface4{
    public void display1(){
        System.out.println("displaying information 1");
    }

    public void display2(){
        System.out.println("displaying information 2");
    }

    public void display3(){
        System.out.println("displaying information 3");
    }

    public void display4(){
        System.out.println("displaying information 4");
    }
}

abstract class AbstractClassWithProtectedMembers{
    protected abstract void display1();     //This will be available only in sub classes
    public abstract void display2();
    public abstract void display3();
}

class ConcreteClassWithProtectedMembers extends AbstractClassWithProtectedMembers{
    @Override
    protected void display1(){
        System.out.println("This is a protected member available only in sub classes in other packages or all classes in this package.");
    }

    @Override
    public void display2(){
        System.out.println("This is member #2, is public and is available everywhere.");
    }

    @Override
    public void display3(){
        System.out.println("This is member #3, is public and is available everywhere.");
    }
}

class AnotherConcreteClassWithProtectedMembers extends ConcreteClassWithProtectedMembers{
    public void callProtectedMethod(){
        display1();     //This is protected member declared and implemented on parent class.
    }
}

public class AbstractVsInterface {
    public static void main(String[] args) {
        //Difference No.1:
        // Abstract class can extend only one class or one abstract class at a time.
        // Interface can extend any number of interfaces at a time. A class can implement any number of interfaces.
        BaseClass baseClass = new BaseClass();
        baseClass.baseMethod1();    //has baseMethod1;
        baseClass.baseMethod2();    //has baseMethod2;

        ConcreteClass1 concreteClass1 = new ConcreteClass1();
        //has all methods from the following hierarchy
        /*
        BaseClass
        =========
            |
            |-------- AbstractClass1
                            |-------- ConcreteClass1
        * */
        concreteClass1.baseMethod1();
        concreteClass1.baseMethod2();
        concreteClass1.simpleMethod();
        concreteClass1.abstractMethod();

        ConcreteClass2 concreteClass2 = new ConcreteClass2();
        //has all methods from the following hierarchy
        /*
        OtherClass
        ==========
            |
            |-------- AbstractClass2
                            |-------- ConcreteClass2
        * */
        concreteClass2.OtherMethod();
        concreteClass2.someMethod();

        //has all the methods from 4 interfaces
        //In the following way
        /*
        _____________
        |Implementer|
        -------------
            |________|Interface3|
            |        ------------
            |             |________ Interface1
            |             |________ Interface2
            |________|Interface4|
                     -------------
        * */
        Implementer implementer = new Implementer();
        implementer.display1();
        implementer.display2();
        implementer.display3();
        implementer.display4();

        //Difference No.2:
        // Abstract class can be extended(inherited) by a class or an abstract class
        // Interfaces can be extended only by interfaces. Classes has to implement them instead of extend
        /*see above implementations*/

        //Difference No.3:
        // Abstract class can have both abstract and concrete methods.
        // Interface can only have abstract methods, they cannot have concrete methods
        /*see above implementations*/

        //Difference No.4:
        // In abstract class, the keyword ‘abstract’ is mandatory to declare a method as an abstract.
        // In interfaces, the keyword ‘abstract’ is optional to declare a method as an abstract because all the methods are abstract by default.
        /*see above implementations*/

        //Difference No.5:
        // Abstract class can have protected and public abstract methods
        // Interface can have only public abstract methods.
        ConcreteClassWithProtectedMembers concreteClassWithProtectedMembers = new ConcreteClassWithProtectedMembers();
        concreteClassWithProtectedMembers.display1();
        concreteClassWithProtectedMembers.display2();
        concreteClassWithProtectedMembers.display3();
    }
}
