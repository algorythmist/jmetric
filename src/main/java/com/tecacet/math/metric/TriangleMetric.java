package com.tecacet.math.metric;

/**
 * Distance by sum of absolute value of differences (L1)
 * 
 */
public class TriangleMetric implements VectorMetric {

    public double distance(double[] x, double[] y) {
        if (x.length != y.length) {
            throw new IllegalArgumentException("Vectors must have the same length");
        }
        double d = 0.0;
        for (int i = 0; i < x.length; i++) {
            d += Math.abs(x[i] - y[i]);
        }
        return d;
    }
}