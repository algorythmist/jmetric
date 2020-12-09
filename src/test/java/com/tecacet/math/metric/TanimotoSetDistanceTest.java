package com.tecacet.math.metric;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TanimotoSetDistanceTest {

    @Test
    public void testDistance() {
        TanimotoSetDistance distance = new TanimotoSetDistance();
        boolean[] v1 = {true, true, false, true, true, false, false, true};
        boolean[] v2 = {false, true, false, false, true, false, true, true};
        assertEquals(0.5, distance.distance(v1, v2), 0.0001);
    }

}
