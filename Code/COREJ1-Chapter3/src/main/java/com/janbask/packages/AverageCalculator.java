package com.janbask.packages;

public class AverageCalculator extends SumCalculator {

    public float computeResult(float[] values) {
        float sum=super.performCalculation(values);
        return sum/values.length;
    }
}
