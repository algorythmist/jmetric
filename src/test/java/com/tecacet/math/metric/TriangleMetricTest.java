package com.tecacet.math.metric;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TriangleMetricTest {

    @Test
    public void testDistance() {
        double[] v1 = new double[] {1, 2};
        double[] v2 = new double[] {2, -1};
        VectorMetric metric = new TriangleMetric();
        assertEquals(4.0, metric.distance(v1, v2), 0.0001);
    }

}
