package com.gd.math.utils;

import org.junit.Test;

import java.util.Arrays;

import static com.gd.math.utils.SetOfEquations.getSolutionOfSet;
import static junit.framework.Assert.assertEquals;

/**
 * Created by dbaskal on 2/14/14.
 */
public class SetOfEquationsTest {

    @Test
    public void testGetSolutionOfSet1() {
        Object result = getSolutionOfSet(1, -2.5, 1.2, 2, 1, 3);
        double [] expected = new double[2];
        expected[0] = -1.45;
        expected[1] = -0.1;
        assertEquals(Arrays.toString(expected), result);
    }

    @Test
    public void testGetSolutionOfSet2() {
        Object result = getSolutionOfSet(1.2, -2.5, 5.2, 2.7, 1, 3);
        double [] expected = new double[2];
        expected[0] = -1.597;
        expected[1] = 1.313;
        assertEquals(Arrays.toString(expected), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSolution3() {
        getSolutionOfSet(1.6, 2, 0, 3.2, 4, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSolution4() {
        getSolutionOfSet(1, 2.2, 7.1, 5, 11, 0.23);
    }

}
