package testng.com.gd.math.utils;

import com.gd.math.utils.Quadratic;
import com.gd.math.utils.Result;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by dbaskal on 2/14/14.
 */
public class QuadraticTest {

    @Test
    public void testGetSolution1() {
        Result result = Quadratic.getSolution(new Double(1), new Double(3), new Double(2));
        assertEquals("X1", result.getX1(), new Double(-1));
        assertEquals("X2", result.getX2(), new Double(-2));
    }

    @Test
    public void testGetSolution2() {
        Result result = Quadratic.getSolution(new Double(1), new Double(-2.5), new Double(1.2));
        assertEquals("X1", result.getX1(), new Double(1.852));
        assertEquals("X2", result.getX2(), new Double(0.648));
    }

    @Test
    public void testGetSolution3() {
        Result result = Quadratic.getSolution(new Double(1), new Double(-2), new Double(1));
        assertEquals("X1 == X2", result.getX1(), result.getX2());
        assertEquals("X1", result.getX1(), new Double(1));
    }

    @Test
    public void testGetSolution4() {
        Result result = Quadratic.getSolution(new Double(9), new Double(-6), new Double(1));
        assertEquals("X1 == X2", result.getX1(), result.getX2());
        assertEquals("X1", result.getX1(), new Double(0.333));
    }

    @Test
    public void testGetSolution5() {
        Result result = Quadratic.getSolution(new Double(1), new Double(2), new Double(10));
        assertNull("No result", result);
    }

}
