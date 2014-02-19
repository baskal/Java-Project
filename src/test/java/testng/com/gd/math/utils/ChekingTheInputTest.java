package testng.com.gd.math.utils;

import org.testng.annotations.*;

import static com.gd.math.utils.CheckingTheInput.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by dbaskal on 2/17/14.
 */

public class ChekingTheInputTest {

    @Test
    public void testIsDigital1() {
        boolean result = isDigital("984563");
        assertTrue(result);
    }

    @Test
    public void testIsDigital2() {
        boolean result = isDigital("ijg4fgh");
        assertFalse(result);
    }

    @Test
    public void testIsEMail1() {
        boolean result = isEMail("login@gmail.com");
        assertTrue(result);
    }

    @DataProvider
    public static Object[][] getEmail() {
        return new Object[][]{
                {"login..123@gmail.com"},
                {"login.gmail.com"},
                {"login@gmail.c"},
                {"login@gmail.123"},
                {""}
        };
    }

    @Test(dataProvider = "getEmail")
    public void testEMail(String s) {
        boolean result = isEMail(s);
        assertFalse(result);
    }

    @Test
    public void testIsUsername1() {
        boolean result = isUsername("username_1");
        assertTrue(result);
    }

    @Test
    public void testIsUsername2() {
        boolean result = isUsername("Username.");
        assertFalse(result);
    }

    @Test
    public void testIsUsername3() {
        boolean result = isUsername("12");
        assertFalse(result);
    }

    @Test
    public void testIsUsername4() {
        boolean result = isUsername("");
        assertFalse(result);
    }
}
