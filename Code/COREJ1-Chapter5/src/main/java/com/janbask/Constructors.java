package com.janbask;

/*
 * Constructors: Important Points
 * Every class has a constructor whether it’s a normal class or a abstract class.
 * Constructors are not methods and they don’t have any return type.
 * Constructor name should match with class name .
 * Constructor can use any access specifier, they can be declared as private also. Private constructors are possible in java but there scope is within the class only.
 * Like constructors method can also have name same as class name, but still they have return type, though which we can identify them that they are methods not constructors.
 * If you don’t implement any constructor within the class, compiler will do it for.
 * this() and super() should be the first statement in the constructor code. If you don’t mention them, compiler does it for you accordingly.
 * Constructor overloading is possible but overriding is not possible. Which means we can have overloaded constructor in our class but we can’t override a constructor.
 * Constructors can not be inherited.
 * If Super class doesn’t have a no-arg(default) constructor then compiler would not insert a default constructor in child class as it does in normal scenario.
 * Interfaces do not have constructors.
 * Abstract class can have constructor and it gets invoked when a class, which implements interface, is instantiated. (i.e. object creation of concrete class).
 * A constructor can also invoke another constructor of the same class – By using this().
 * If you want to invoke a parameterized constructor then do it like this: this(parameter list).
* */

import java.util.Date;

//Constructor has same name as the class and looks like this in a java code.
    class MyClass{
        //This is the constructor - no-arg
        MyClass(){
            System.out.println("Creating instance/object of MyClass");
        }
    }

    //A simple constructor program in java
    //Here we have created an object obj of class Hello and then we displayed the instance variable name of the object.
    // As you can see that the output is JanbaskTraining.com which is what we have passed to the name during initialization in constructor.
    // This shows that when we created the object obj the constructor got invoked.
    // In this example we have used this keyword, which refers to the current object, object obj in this example.
    class Hello {
        String name;

        //Constructor
        Hello() {
            this.name = "JanbaskTraining.com";
        }
    }

    //Default constructor
    class DefaultConstructor{
        int value = -1;
        void printMessage(String message){
            System.out.format("\nYour message is: %s\nMy Current Value is: %s\nValue after this method would be", message, value++, value);
        }
    }

    //Parametrized Constructor
    class Employee {

        int empId;
        String empName;

        //parametrized constructor with two parameters
        Employee(int id, String name) {
            this.empId = id;
            this.empName = name;
        }

        void info() {
            System.out.println("Id: " + empId + " Name: " + empName);
        }
    }

    //Constructor chaining
    //Whenever a child class constructor gets invoked it implicitly invokes the constructor of parent class.
    //You can also say that the compiler inserts a super(); statement at the beginning of child class constructor.
    class MyParentClass {
        MyParentClass(){
            System.out.println("MyParentClass Constructor");
        }
    }
    class MyChildClass extends MyParentClass {
        MyChildClass() {
            System.out.println("MyChildClass Constructor");
        }
    }

    //explicit constructor chaining - if your classes have parametrized constructors you can call them from child class constructors
    class BusinessEntity{
        int id;
        int createdBy;
        Date createdOn;
        int modifiedBy;
        Date modifiedOn;

        BusinessEntity() {
            this(-1);
        }

        BusinessEntity(int idValue){
            this(idValue, -1, new Date());
        }

        BusinessEntity(int idValue, int createdByValue, Date createdOnValue){
            this(idValue, createdByValue, createdOnValue, -1, new Date());
        }

        BusinessEntity(int idValue, int createdByValue, Date createdOnValue, int modifiedByValue, Date modifiedOnValue){
            id=idValue;
            createdBy = createdByValue;
            createdOn = createdOnValue;
            modifiedBy = modifiedByValue;
            modifiedOn = modifiedOnValue;
        }
    }

    class Student extends BusinessEntity{
        String name;
        int grade;
        Student() {
            //Super need to be the first statement;
            super();
            name = "Unknown";
            grade = -1;

        }

        Student(String studentName, int studentGrade) {
            //Super need to be the first statement;
            super();
            name = studentName;
            grade = studentGrade;

        }

        Student(int id, String studentName, int studentGrade) {
            //Super need to be the first statement;
            super(id);
            name = studentName;
            grade = studentGrade;

        }
    }

    //Constructor Overloading Example
    /*
     * Like methods, constructors can also be overloaded.
     * In this guide we will see Constructor overloading with the help of examples.
     * Constructor overloading is a concept of having more than one constructor with different parameters list, in such a way so that each constructor performs a different task.
     * For e.g. Vector class has 4 types of constructors.
     * If you do not want to specify the initial capacity and capacity increment then you can simply use default constructor of Vector class like this Vector v = new Vector();
     * However if you need to specify the capacity and increment then you call the parametrized constructor of Vector class with two int arguments like this: Vector v= new Vector(10, 5);
    * */
    class StudentData {
        private int stuID;
        private String stuName;
        private int stuAge;

        StudentData() {
            //Default constructor
            this(-1);
        }

        StudentData(int id){
            this(id,"Unknown", -1);
        }

        StudentData(int id, String name, int age) {
            //Parametrized constructor
            stuID = id;
            stuName = name;
            stuAge = age;
        }

        //Getter and setter methods
        public int getStuID() {
            return stuID;
        }

        public void setStuID(int stuID) {
            this.stuID = stuID;
        }

        public String getStuName() {
            return stuName;
        }

        public void setStuName(String stuName) {
            this.stuName = stuName;
        }

        public int getStuAge() {
            return stuAge;
        }

        public void setStuAge(int stuAge) {
            this.stuAge = stuAge;
        }
    }

    //Copy Constructor
    class Person{
        String name;
        int age;
        Person(){
            name = "Unknown";
            age = -1;
        }

        Person(String name, int age){
            this.name = name;
            this.age = age;
        }
    }

    class Teacher{
        String name;
        int age;
        int experience;
        String subject;

        Teacher(Person person, int experience, String subject){
            this.name = person.name;
            this.age = person.age;
            this.experience = experience;
            this.subject = subject;
        }
    }

    class Worker{
        Person person;
        double salary;
        Worker(Person person, double salary){
            this.person = new Person(person.name, person.age);
            this.salary = salary;
        }
    }

    //private constructor - singleton

    class Singleton{
        private int counter;
        private Singleton(){
            counter = 0;
        }

        public int getCounter(){ return counter; }
        private static Singleton instance = new Singleton();

        static Singleton getInstance(){
            instance.counter += 1;
            return instance;
        }
    }

    public class Constructors {

        public static void main(String[] args) {
            //To understand the working of constructor, lets take an example. lets say we have a class MyClass.
            //When we create the object of MyClass like this:
            MyClass myClassObject = new MyClass();
            //The new keyword here creates the object of class MyClass and invokes the constructor to initialize this newly created object.

            //Simple Constructor & Object Initialization
            Hello helloObject = new Hello();
            System.out.println(helloObject.name);

            //Default constructor
            DefaultConstructor defaultConstructorObject = new DefaultConstructor();
            defaultConstructorObject.printMessage("We say hello to you!");

            //No-arg constructor
            Hello hello = new Hello(); //OR
            myClassObject = new MyClass();

            //Parametrized Constructor
            Employee employeeObj1 = new Employee(10245, "Chaitanya");
            Employee employeeObj2 = new Employee(92232, "Negan");
            employeeObj1.info();
            employeeObj2.info();

            //Only having parametrized constructor will result in compilation error if you try to do the below.
            //Employee employee = new Employee();

            //super() & Constructor Overloading
            new MyChildClass();
            new Student();
            new Student(1, "Test Student",  10);

            //private constructor - singleton
            Singleton instance1 = Singleton.getInstance();
            Singleton instance2 = Singleton.getInstance();
            System.out.format("\nCurrent Number of instances as per instance 1: %s", instance1.getCounter());
            System.out.format("\nCurrent Number of instances as per instance 2: %s", instance2.getCounter());
        }
    }
