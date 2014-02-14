package com.gd.math.test.utils;

import org.junit.Test;

import static com.gd.math.utils.Triangle.*;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by dbaskal on 2/14/14.
 */

public class TriangleTest {
    @Test
    public void testIsRight1() {
        boolean result = isRight(3, 4, 5);
        assertTrue(result == true);
        //assertEquals("Error", true, result);
    }

    @Test
    public void testIsRight2() {
        boolean result = isRight(3, 4, 2);
        assertTrue(result == false);
    }

    /*@Test
    public void testIsRight3() {
        try {
            isRight(2, 8, -5);
            assertTrue(false);
        } catch (IllegalArgumentException e) {
        }

    }*/

    @Test(expected = IllegalArgumentException.class)
    public void testIsRight3() {
            isRight(2, 7, -6);
        }

    @Test
    public void testIsRegular1() {
        boolean result = isRegular(3, 3, 3);
        assertFalse(result != true);
    }

    @Test
    public void testIsRegular2() {
        boolean result = isRegular(3, 3, 4);
        assertFalse(result != false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsRegular3() {
        isRegular(2, 7, -6);
    }

}