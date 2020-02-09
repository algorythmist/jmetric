package com.tecacet.math.metric;

public class TanimotoSetDistance implements Metric<boolean[]> {

    @Override
    public double distance(boolean[] v1, boolean[] v2) {
        int union = 0;
        int intersection = 0;

        for (int i = 0; i < v1.length; i++) {
            if (v1[i] || v2[i]) {
                union++;
            }
            if (v1[i] && v2[i]) {
                intersection++;
            }

        }
        return 1.0 - (double) intersection / (double) union;
    }

}
