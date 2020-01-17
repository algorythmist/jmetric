package com.tecacet.math.metric;

public class TanimotoVectorDistance implements VectorMetric {

	@Override
	public double distance(double[] v1, double[] v2) {
		int union = 0;
		int intersection = 0;
		
		for (int i = 0; i < v1.length; i++) {
			if (v1[i] > 0 || v2[i] > 0) {
				union++;
			}
			if (v1[i] > 0 && v2[i] > 0) {
				intersection++;
			}

		}
		return 1.0 - (double) intersection / (double)union;
	}

}
