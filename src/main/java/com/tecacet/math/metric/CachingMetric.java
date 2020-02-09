package com.tecacet.math.metric;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 * Metric decorator that caches calculated distances to avoid re-calculating them
 *
 * @param <T>
 * @author dimitri
 */
public class CachingMetric<T, K> implements Metric<T> {

    private final Metric<T> delegate;
    private final BiFunction<T, T, K> keyExtractor;

    private final Map<K, Double> distances = new HashMap<>();

    public CachingMetric(Metric<T> delegate, BiFunction<T, T, K> keyExtractor) {
        super();
        this.delegate = delegate;
        this.keyExtractor = keyExtractor;
    }

    @Override
    public double distance(T v1, T v2) {
        K key = keyExtractor.apply(v1, v2);
        Double distance = distances.get(key);
        if (distance == null) {
            distance = delegate.distance(v1, v2);
            distances.put(key, distance);
        }
        return distance;
    }

}
