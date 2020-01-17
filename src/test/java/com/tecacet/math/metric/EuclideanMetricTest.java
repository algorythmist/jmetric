package com.tecacet.math.metric;

import static org.junit.Assert.*;

import org.junit.Test;

public class EuclideanMetricTest {

	@Test
	public void testDistance() {
		double[] v1 = new double[] {1, 2};
		double[] v2 = new double[] {2, -1};
		VectorMetric euclidean = new EuclideanMetric();
		assertEquals(Math.sqrt(10.0), euclidean.distance(v1, v2), 0.0001);
	}

}
