package com.janbask.program;
//imports all the classes in package
import com.janbask.packages.*;
//alternatively you can import each class individually
import com.janbask.packages.SumCalculator;
import com.janbask.packages.AverageCalculator;

/*
 * Don't worry if you don't understand the interfaces and classes code, we will cover all this in great detail in Chapter 4 and Chapter 5
 * Right now let's just focus on understanding the packages and imports.
 * We have also introduced some topics like polymorphism, inheritance etc. here to generate interest in the OOPs concepts that we will study in next 2 chapter
* */
public class Main {
    public static void main(String[] args) {
        Computable calculator = new SumCalculator();
        //if we hadn't imported the package then we would have done something like below
        //com.janbask.packages.Computable computable = new SumCalculator();
        float[] numbers = new float[]{3.45f, 4.42f, 5.55f, 6.18f};
        System.out.format("The sum is: %s", calculator.computeResult(numbers));
        calculator = new AverageCalculator();
        System.out.format("\nThe Average is: %s", calculator.computeResult(numbers));
    }
}
