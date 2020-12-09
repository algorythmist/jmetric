package com.tecacet.math.metric;

import static org.junit.Assert.*;

import org.junit.Test;

public class TanimotoVectorDistanceTest {

    @Test
    public void distance() {
        double[] v1 = new double[] {1, 2};
        double[] v2 = new double[] {2, -1};
        VectorMetric metric = new TanimotoVectorDistance();
        assertEquals(0.5, metric.distance(v1, v2), 0.0001);
    }
}