package com.tecacet.math.metric;

/**
 * A metric gives a measure of distance between two elements. A metric D must
 * satisfy the following contract:
 * <p>
 * {@literal D(x,y) >= 0} for all x,y D(x,y) = 0 if and only if x.equals(y) D(x,y) = D(y,x)
 * for any two points x,y (symmetry) {@literal D(x,y)+D(y,z) <= D(x,z)}
 * (triangle inequality)
 *
 * @param <T> the type of elements in the metric space
 */
public interface Metric<T> {
    /**
     * The distance between two vectors
     *
     * @param v1 the first vector
     * @param v2 the second vector
     * @return the distance according to this metric
     */
    double distance(T v1, T v2);
}
