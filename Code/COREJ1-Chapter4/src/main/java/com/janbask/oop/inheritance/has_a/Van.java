package com.janbask.oop.inheritance.has_a;

/*
 * These relationships are mainly based on the usage.
 * This determines whether a certain class HAS-A certain thing. This relationship helps to reduce duplication of code as well as bugs.
 * This shows that class Van HAS-A Speed.
 * By having a separate class for Speed, we do not have to put the entire code that belongs to speed inside the Van class, which makes it possible to reuse the Speed class in multiple applications.
 * In Object-Oriented feature, the users do not need to bother about which object is doing the real work.
 * To achieve this, the Van class hides the implementation details from the users of the Van class.
 * So, basically what happens is the users would ask the Van class to do a certain action and the Van class will either do the work by itself or ask another class to perform the action.
* */

public class Van extends Vehicle {
    private Speed sp;
}