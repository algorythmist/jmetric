package com.tecacet.math.metric;

public class MetricFactory {

    private static final VectorMetric EUCLID = new EuclideanMetric();
    private static final VectorMetric MANHATTAN = new ManhattanMetric();
    private static final VectorMetric TRIANGLE = new TriangleMetric();
    private static final VectorMetric PEARSON = new PearsonDistanceMetric();
    private static final VectorMetric TANIMOTO = new TanimotoVectorDistance();

    public static VectorMetric getEuclidean() {
        return EUCLID;
    }

    public static VectorMetric getManhattan() {
        return MANHATTAN;
    }

    public static VectorMetric getTriangle() {
        return TRIANGLE;
    }

    public VectorMetric getPearsonDistance() {
        return PEARSON;
    }

    public VectorMetric getTanimotoDistance() {
        return TANIMOTO;
    }
}
