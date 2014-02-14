package com.gd.math.test.utils;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static com.gd.math.utils.SetOfEquations.getSolutionOfSet;
import static junit.framework.Assert.assertEquals;

/**
 * Created by dbaskal on 2/14/14.
 */
public class SetOfEquationsTest {

    @Test
    public void testGetSolution1() {
        Set result = new HashSet(getSolutionOfSet(1, 1, -5, 3, -2, 0));
        assertEquals("Error", new HashSet(Arrays.asList(3., 2.)), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSolution2() {
        getSolutionOfSet(1, 2, 7, 3, 6, 0);
    }


}
