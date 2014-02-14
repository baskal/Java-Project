package com.gd.math.test.utils;

import org.junit.Test;

import static com.gd.math.utils.Circle.*;
import static junit.framework.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

/**
 * Created by dbaskal on 2/14/14.
 */
public class CircleTest {

    @Test
    public void testGetArea1() {
        Double result = getArea(5);
        assertEquals("Error", Math.PI * 25, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetArea2() {
        getArea(-6);
    }

    @Test
    public void testGetArea3() {
        Double result = getArea(5);
        assertThat(result, is(not(0.)));
    }

    @Test
    public void testGetPerimeter1() {
        Double result = getPerimeter(5);
        assertEquals("Error", 2 * Math.PI * 5, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetPerimeter2() {
        getPerimeter(0);
    }

}