package com.tecacet.math.metric;


/**
 * Distance by maximum component (L-infinity)
 */
public class ManhattanMetric implements VectorMetric {

    public double distance(double[] x, double[] y) {
        double max = 0.0;
        double d;
        for (int i = 0; i < x.length; i++) {
            d = Math.abs(x[i] - y[i]);
            if (max < d) {
                max = d;
            }
        }
        return max;
    }
}
