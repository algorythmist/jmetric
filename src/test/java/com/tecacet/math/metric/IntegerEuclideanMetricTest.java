package com.tecacet.math.metric;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerEuclideanMetricTest {

    @Test
    public void testDistance() {
        int[] v1 = new int[] {1, 2};
        int[] v2 = new int[] {2, -1};
        Metric<int[]> euclidean = new IntegerEuclideanMetric();
        assertEquals(10.0, euclidean.distance(v1, v2), 0.0001);
    }

}
