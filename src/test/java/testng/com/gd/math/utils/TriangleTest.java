package testng.com.gd.math.utils;


import org.testng.annotations.Test;

import static com.gd.math.utils.Triangle.isRegular;
import static com.gd.math.utils.Triangle.isRight;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by dbaskal on 2/14/14.
 */

public class TriangleTest {
    @Test
    public void testIsRight1() {
        boolean result = isRight(3, 4, 5);
        assertTrue(result);
    }

    @Test
    public void testIsRight2() {
        boolean result = isRight(5, 4, 3);
        assertTrue(result);
    }

    @Test
    public void testIsRight3() {
        boolean result = isRight(3, 4, 2);
        assertFalse(result);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testIsRight4() {
            isRight(3, -4, -2);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testIsRight5() {
        isRight(3, 4, 9);
    }

    @Test
    public void testIsRegular1() {
        boolean result = isRegular(3, 3, 3);
        assertTrue(result);
    }

    @Test
    public void testIsRegular2() {
        boolean result = isRegular(3, 4, 3);
        assertFalse(result);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "A, b, c must be positive")
    public void testIsRegular3() {
        isRegular(2, 7, -6);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "The triangle inequality is not satisfied")
    public void testIsRegular4() {
        isRegular(2, 7, 10);
    }

}