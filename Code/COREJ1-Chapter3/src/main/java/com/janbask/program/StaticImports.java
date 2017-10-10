package com.janbask.program;

//You can import individual static members from a type
import static java.lang.Math.PI;
//or you can import all public static members of a type
import static com.janbask.packages.Calculator.*;
public class StaticImports {

    public static void main(String[] args) {
        double piValue = PI;
        System.out.format("Value of PI is: %s", piValue);
        //or you can even do
        System.out.format("\nDirect value of PI is: %s", PI);
        //because we have statically imported everything from com.janbask.packages.Calculator, we can do -
        float[] numbers = new float[]{3.45f, 4.42f, 5.55f, 6.18f};
        System.out.format("\nThe sum is: %s", CalculateSum(numbers));
        System.out.format("\nThe Average is: %s", CalculateAverage(numbers));
    }
}
