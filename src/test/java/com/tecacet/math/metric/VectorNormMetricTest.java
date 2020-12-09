package com.tecacet.math.metric;

import static org.junit.Assert.assertEquals;

import com.tecacet.math.norm.LpNorm;

import org.junit.Test;

public class VectorNormMetricTest {

    @Test
    public void testDistance() {
        LpNorm lpNorm = new LpNorm(3);
        VectorNormMetric metric = new VectorNormMetric(lpNorm);
        double[] v1 = new double[] {1.0, 3.0, -2.0};
        double[] v2 = new double[] {-4.0, 2.0, -1.0};
        assertEquals(3.3019, lpNorm.value(v1), 0.001);
        assertEquals(4.1793, lpNorm.value(v2), 0.001);
        assertEquals(5.026, metric.distance(v1, v2), 0.001);
    }

}
