package com.janbask.oop.inheritance.is_a;

public class Dog extends Mammal {
    /*
     * IS-A Relationship
        * IS-A is a way of saying: This object is a type of that object. Let us see how the extends keyword is used to achieve inheritance.
        * in Object-Oriented terms, the following are true −
        * Animal is the super type of Mammal class.
        * Animal is the super type of Reptile class.
        * Mammal and Reptile are sub types of Animal class.
        * Dog is the subclass of both Mammal and Animal classes.
      * if we consider the IS-A relationship, we can say −
        * Mammal IS-A Animal
        * Reptile IS-A Animal
        * Dog IS-A Mammal
        * Hence: Dog IS-A Animal as well
    * */
    public static void main(String args[]) {
        Mammal m = new Mammal();
        Reptile r = new Reptile();
        Dog d = new Dog();

        System.out.println(m instanceof Animal);
        System.out.println(r instanceof Animal);
        System.out.println(d instanceof Mammal);
        System.out.println(d instanceof Animal);
    }
}
