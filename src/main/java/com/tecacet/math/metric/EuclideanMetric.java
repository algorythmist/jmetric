package com.tecacet.math.metric;


/**
 * Standard Euclidean distance in finite dimensional vector space
 */
public class EuclideanMetric implements VectorMetric {
	
    public double distance(double[] x, double[] y) {
        double d = 0.0;
        for (int i = 0; i < x.length; i++) {
            d += (x[i] - y[i]) * (x[i] - y[i]);
        }
        return Math.sqrt(d);
    }
}
