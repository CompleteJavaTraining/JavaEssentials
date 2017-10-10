package com.janbask.program;

import com.janbask.oop.Encapsulation;

public class EncapsulationTest {
    public static void main(String[] args) {
        Encapsulation encap = new Encapsulation();
        encap.setName("James");
        encap.setAge(20);
        encap.setIdNum("12343ms");

        System.out.print("Name : <" + encap.getName() + "> Age : <" + encap.getAge() + ">");

        //OUTPUT:
        //Name : <James> Age : <20>
    }
}
