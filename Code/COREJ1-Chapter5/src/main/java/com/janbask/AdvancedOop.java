package com.janbask;

/*
 * Delegation, Composition and Aggregation Example
* */

import java.util.ArrayList;
import java.util.List;

interface Behaviour{
    public void performAction();
}

//Behaviours for Duck objects
class Quack implements Behaviour{
    private Duck duckObject;
    public void performAction(){
        System.out.format("\nThis is %s Quacking", duckObject.getName());
    }

    Quack(Duck duckObject){
        this.duckObject = duckObject;
    }
}

class Fly implements Behaviour{
    private Duck duckObject;
    public void performAction(){
        System.out.format("\nThis is %s Flying", duckObject.getName());
    }

    Fly(Duck duckObject){
        this.duckObject = duckObject;
    }
}

class Swim implements Behaviour{
    private Duck duckObject;
    public void performAction(){
        System.out.format("\nThis is %s Swimming", duckObject.getName());
    }

    Swim(Duck duckObject){
        this.duckObject = duckObject;
    }
}

//Duck Types
//Base type for Ducks
abstract class Duck{
    private String name;
    private Flock flockReference;

    public String getName() {
        return name;
    }

    Duck(String name){
        this.name = name;
    }

    //a helper method to add duck to flock object
    public void join(Flock flock){
        System.out.format("\nI would like to join %s, checking if I can join", flock.getFlockName());
        if(flockReference!=null){
            if(flockReference.equals(flock))
                System.out.format("\nI am already a part of %s and I am happy about it", flock.getFlockName());
            else {
                System.out.format("\nGood bye %s", flockReference.getFlockName());
                flockReference.removeMember(this);
                flock.addMember(this);
                flockReference = flock;
                System.out.format("\nThank you %s for taking me in.", flockReference.getFlockName());
            }
        }else{
            flock.addMember(this);
            flockReference = flock;
        }
    }
}

//A more specific type - a duck that can Quack
class QuackingDuck extends Duck {

    Behaviour quackObject;
    QuackingDuck(String name) {
        super(name);
        quackObject = new Quack(this);
    }
}

//Most (all) of the Ducks can Swim
class SwimmingDuck extends QuackingDuck {
    Behaviour swimObject;
    SwimmingDuck(String name) {
        super(name);
        swimObject = new Swim(this);
    }
}

//Some of them can even fly.
class FlyingDuck extends SwimmingDuck {
    Behaviour flyObject;
    FlyingDuck(String name) {
        super(name);
        flyObject = new Fly(this);
    }
}

//Aggregation
class Flock{
    private List<Duck> members;
    private String flockName;

    public List<Duck> getMembers() {
        return members;
    }

    public String getFlockName(){
        return flockName;
    }

    Flock(String name){
        members=new ArrayList<Duck>();
        this.flockName = name;
    }

    public void addMember(Duck duck){
        members.add(duck);
        System.out.format("\nWelcome to %s, you are now one of us dear %s", flockName, duck.getName());
    }

    public void removeMember(Duck duck){
        members.remove(duck);
        System.out.format("\nWe are sad to let you go dear %s", duck.getName());
    }
}

public class AdvancedOop {
    public static void main(String[] args) {
        Flock starkFlock = new Flock("Starks");
        Flock lannisterFlock = new Flock("Lannisters");
        Flock targaryenFlock =new Flock("Targaryens");
        Flock tyrellFlock =new Flock("Tyrells");

        QuackingDuck maceTyrell = new QuackingDuck("Mace Tyrell");
        maceTyrell.quackObject.performAction();
        tyrellFlock.addMember(maceTyrell);

        //or a duck can join a Flock
        FlyingDuck olennaTyrell = new FlyingDuck(" Olenna Tyrell");
        olennaTyrell.flyObject.performAction();
        olennaTyrell.join(tyrellFlock);

        //or a duck can join another flock
        olennaTyrell.join(lannisterFlock);

        //ToDo: Assignment find out the areas that can be improved in this program based on good Object Oriented practices and SOLID Principles.
    }
}
