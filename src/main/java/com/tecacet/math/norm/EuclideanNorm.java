package com.tecacet.math.norm;

public class EuclideanNorm implements VectorNorm {

    @Override
    public double value(double[] v) {
        double d = 0.0;
        for (double value : v) {
            d += value * value;
        }
        return Math.sqrt(d);
    }

}
