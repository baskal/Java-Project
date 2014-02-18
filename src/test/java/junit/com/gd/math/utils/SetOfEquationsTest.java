package junit.com.gd.math.utils;

import com.gd.math.utils.Result;
import com.gd.math.utils.SetOfEquations;
import org.junit.Test;


import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by dbaskal on 2/14/14.
 */
public class SetOfEquationsTest {

    @Test
    public void testGetSolutionOfSet1() {
        Result result = SetOfEquations.getSolutionOfSet(new Double(1), new Double(-2.5), new Double(1.2),
                new Double(2), new Double(1), new Double(3));
        assertEquals("X1", result.getX1(), new Double(-1.45));
        assertEquals("X2", result.getX2(), new Double(-0.1));
    }

    @Test
    public void testGetSolutionOfSet2() {
        Result result = SetOfEquations.getSolutionOfSet(new Double(1.2), new Double(-2.5), new Double(5.2),
                new Double(2.7), new Double(1), new Double(3));
        assertEquals("X1", result.getX1(), new Double(-1.597));
        assertEquals("X2", result.getX2(), new Double(1.313));
    }

    @Test
    public void testGetSolution5() {
        Result result = SetOfEquations.getSolutionOfSet(new Double(1.6), new Double(2), new Double(0),
                new Double(3.2), new Double(4), new Double(0));
        assertNull("No result", result);
    }

}
