package com.janbask.packages;

import sun.print.SunMinMaxPage;

public class SumCalculator implements Computable {
    public float computeResult(float[] values) {
        return performCalculation(values);
    }

    protected float performCalculation(float[] values){
        float sum=0.00f;
        for (float item:values) {
            sum += item;
        }
        return sum;
    }
}
