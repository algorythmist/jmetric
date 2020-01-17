package com.tecacet.math.metric;

import static org.junit.Assert.*;

import org.junit.Test;

public class ManhattanMetricTest {

	@Test
	public void test() {
		double[] v1 = new double[] {1, 2};
		double[] v2 = new double[] {2, -1};
		VectorMetric metric = new ManhattanMetric();
		assertEquals(3.0, metric.distance(v1, v2), 0.0001);
	}

}
