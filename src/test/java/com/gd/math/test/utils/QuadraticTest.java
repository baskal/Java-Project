package com.gd.math.test.utils;

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
        Set result = new HashSet(getSolution(1, -3, 2));
        assertEquals("Error", new HashSet(Arrays.asList(1.0, 2.0)), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSolution2() {
        getSolution(1, 2, 5);
    }

}
