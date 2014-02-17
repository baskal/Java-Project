package com.gd.math.utils;

import org.junit.Test;

import java.util.*;

import static com.gd.math.utils.Quadratic.getSolution;
import static junit.framework.Assert.assertEquals;

/**
 * Created by dbaskal on 2/14/14.
 */
public class QuadraticTest {

    @Test
    public void testGetSolution1() {
        Object result = getSolution(1., -3., 2.);
        double [] expected = new double[2];
        expected[0] = 2.;
        expected[1] = 1.;
        assertEquals(Arrays.toString(expected), result);
    }

    @Test
    public void testGetSolution2() {
        Object result = getSolution(1, -2.5, 1.2);
        double [] expected = new double[2];
        expected[0] = 1.852;
        expected[1] = 0.648;
        assertEquals(Arrays.toString(expected), result);
    }

    @Test
    public void testGetSolution3() {
        Object result = getSolution(1, -2, 1);
        assertEquals(1., result);
    }

    @Test
    public void testGetSolution4() {
        Object result = getSolution(9, -6, 1);
        assertEquals(0.333, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSolution5() {
        getSolution(1, 2, 5);
    }
}
