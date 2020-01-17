package com.tecacet.math.norm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EuclideanNormTest {

	@Test
	public void test() {
		double[] v = new double[] {1, 2, -3, 1, -1};
		VectorNorm euclidean = new EuclideanNorm();
		assertEquals(4.0, euclidean.value(v), 0.0001);
	}

}
