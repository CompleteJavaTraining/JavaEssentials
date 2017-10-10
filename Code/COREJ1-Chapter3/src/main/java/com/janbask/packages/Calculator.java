package com.janbask.packages;

public class Calculator {
    public static float CalculateSum(float[] inputs){
        Computable calculator = new SumCalculator();
        return calculator.computeResult(inputs);
    }

    public static float CalculateAverage(float[] inputs){
        Computable calculator = new AverageCalculator();
        return calculator.computeResult(inputs);
    }
}
