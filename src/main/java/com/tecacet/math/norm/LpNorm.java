package com.tecacet.math.norm;

public class LpNorm implements VectorNorm {

    private final double p;

    public LpNorm(double p) {
        super();
        this.p = p;
    }

    @Override
    public double value(double[] v) {
        double d = 0.0;
        for (double value : v) {
            d += p == 1 ? Math.abs(value) : Math.pow(Math.abs(value), p);
        }
        return p == 1 ? d : Math.pow(d, 1 / p);
    }

}
