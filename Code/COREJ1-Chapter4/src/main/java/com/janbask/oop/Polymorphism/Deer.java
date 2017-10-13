package com.janbask.oop.Polymorphism;

interface Vegetarian{}
class Animal{}
public class Deer extends Animal implements Vegetarian{
    public static void main(String[] args) {
        Deer d = new Deer();
        Animal a = d;
        Vegetarian v = d;
        Object o = d;
    }
}

/*
 * the Deer class is considered to be polymorphic since this has multiple inheritance. Following are true for the above examples −
 * A Deer IS-A Animal
 * A Deer IS-A Vegetarian
 * A Deer IS-A Deer
 * A Deer IS-A Object
* */
