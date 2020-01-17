package com.tecacet.math.metric;

import org.apache.commons.math3.stat.correlation.PearsonsCorrelation;


public class PearsonDistanceMetric implements VectorMetric {

	private final PearsonsCorrelation pearsonsCorrelation = new PearsonsCorrelation();

	@Override
	public double distance(double[] v1, double[] v2) {
		return 1.0 - pearsonsCorrelation.correlation(v1, v2);
	}

}
