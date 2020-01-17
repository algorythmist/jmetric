package com.tecacet.math.metric;


/**
 * Standard Euclidean distance in finite dimensional vector space
 */
public class IntegerEuclideanMetric implements Metric<int[]> {
    /**
     * Euclidean distance squared to avoid the square root calculation
     */
    public double distance(int[] x, int[] y) {
        double d = 0.0;
        for (int i = 0; i < x.length; i++) {
            d += (x[i] - y[i]) * (x[i] - y[i]);
        }
        return d;
    }
}
