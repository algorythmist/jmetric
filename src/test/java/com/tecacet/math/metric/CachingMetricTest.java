package com.tecacet.math.metric;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.Objects;

public class CachingMetricTest {

    @Test
    public void testDistance() {
        double[] v1 = new double[] {1, 2};
        double[] v2 = new double[] {2, -1};
        VectorMetric pearsonMetric = new PearsonDistanceMetric();

        //A hash is not a proper key - this is only for demo purposes
        CachingMetric<double[], Integer> metric = new CachingMetric<>(pearsonMetric, (v, w) -> Objects.hash(v, w));
        assertEquals(2.0, metric.distance(v1, v2), 0.0001);
        assertEquals(2.0, metric.distance(v1, v2), 0.0001);
    }

}
