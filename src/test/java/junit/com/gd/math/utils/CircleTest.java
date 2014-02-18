package junit.com.gd.math.utils;

import org.junit.Test;

import static com.gd.math.utils.Circle.getArea;
import static com.gd.math.utils.Circle.getPerimeter;
import static junit.framework.Assert.assertEquals;

/**
 * Created by dbaskal on 2/14/14.
 */
public class CircleTest {

    @Test
    public void testGetArea1() {
        Double R = 5.;
        Double result = getArea(R);
        assertEquals("Actual area isn't equal expected", Math.PI * Math.pow(R, 2), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetArea2() {
        getArea(-6);
    }

    @Test
    public void testGetPerimeter1() {
        Double R = 5.;
        Double result = getPerimeter(R);
        assertEquals("Actual perimeter isn't equal expected", 2 * Math.PI * R, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetPerimeter2() {
        getPerimeter(0);
    }

}