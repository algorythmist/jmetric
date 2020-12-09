package com.tecacet.math.metric;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class TestMetric implements Metric<Integer> {

    @Override
    public double distance(Integer v1, Integer v2) {
        return Math.abs(v1 - v2);
    }

}


public class AdditiveMetricTest {

    @Test
    public void testDistance() {
        AdditiveMetric<Integer> metric = new AdditiveMetric<>(new TestMetric(), new TestMetric());
        assertEquals(2.0, metric.distance(3, 4), 0.001);
        metric = new AdditiveMetric<>(true, new TestMetric(), new TestMetric());
        assertEquals(1.0, metric.distance(3, 4), 0.001);
    }

}
