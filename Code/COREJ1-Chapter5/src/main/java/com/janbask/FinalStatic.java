package com.janbask;

class ConstantAndStatic{
    //these values are constants and can be directly accessed on the Type/Class FinalStatic
    public final static String SOME_CONSTANT = "Here is some constant text";
    public final static  Double VALUE_OF_PI = Math.PI;

    //These static members and you don't need an object of FinalStatic to call them
    public static double getAreaOfCircle(double radius){
        return VALUE_OF_PI * (radius * radius);
    }
}
public class FinalStatic {

    public static void main(String[] args) {
        System.out.format("\nValue of PI: %s", ConstantAndStatic.VALUE_OF_PI);
        System.out.format("\nsome constant: %s", ConstantAndStatic.SOME_CONSTANT);
        Double radius = 12.3;
        System.out.format("\nArea of circle with Radius %s: %s", radius, ConstantAndStatic.getAreaOfCircle(radius));
    }

}
