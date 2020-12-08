package com.tecacet.math.norm;

/**
 * Norm of an element in a normed space
 * @param <T> the type of the elements in the normed space
 */
public interface Norm<T> {

    double value(T point);
}
