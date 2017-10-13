package com.janbask.program;

import com.janbask.oop.Polymorphism.Employee;
import com.janbask.oop.Polymorphism.Salary;

public class AbstractionTest {
    public static void main(String [] args) {
      /* Following is not allowed and would raise error */
      /*
        Employee e = new Employee("George W.", "Houston, TX", 43);
        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();
      */
      //Here, you cannot instantiate the Employee class, but you can instantiate the Salary Class,
        // and using this instance you can access all the three fields and seven methods of Employee class as shown below.
        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
        System.out.format("\nComputing Pay for %s: %s", s.getName(), s.computePay());
        //Dynamic Polymorphism
        System.out.format("\nComputing Pay for %s: %s", e.getName(), e.computePay());
        System.out.format("\nCall compute taxes for %s", e.getName());
        e.computeTaxes();
        System.out.format("\nCall compute taxes for %s", s.getName());
        s.computeTaxes();
        System.out.println("\n Call mailCheck using Salary reference --");
        s.mailCheck();
        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();
    }
}
