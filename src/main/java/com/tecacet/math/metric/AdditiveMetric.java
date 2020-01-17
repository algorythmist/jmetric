package com.tecacet.math.metric;


/**
 * 
 * The sum or average of two or more metrics, which is trivially also a metric
 * @see Metric
 * @param <T>
 */
public class AdditiveMetric<T> implements Metric<T> {

	private final Metric<T>[] metrics;
	private final boolean average;
	
	public AdditiveMetric(Metric<T> ...metrics) {
	    this(false, metrics);
	}
	
	public AdditiveMetric( boolean average, Metric<T> ...metrics) {
		this.metrics = metrics;
		this.average = average;
	}
	
	public double distance(T p1, T p2) {
		double d = 0;
		for (Metric<T> metric : metrics) {
			d += metric.distance(p1, p2);
		}
		if (average && metrics.length > 0) {
		    d /= metrics.length;
		}
		return d;
	}

    public boolean isAverage() {
        return average;
    }

}
