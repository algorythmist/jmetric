package com.tecacet.math.metric;

import com.tecacet.math.norm.VectorNorm;

public class VectorNormMetric implements VectorMetric {

	private final VectorNorm norm;
	
	public VectorNormMetric(VectorNorm norm) {
		super();
		this.norm = norm;
	}

	@Override
	public double distance(double[] v1, double[] v2) {
		double[] diff = new double[v1.length];
		for (int i = 0; i < v1.length; i++) {
			diff[i] = v1[i] - v2[i]; 
		}
		return norm.value(diff);
	}

}
