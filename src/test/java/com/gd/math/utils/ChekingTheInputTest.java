package com.gd.math.utils;

import org.junit.Test;

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

    @Test
    public void testIsEMail2() {
        boolean result = isEMail("login..123@gmail.com");
        assertFalse(result);
    }

    @Test
    public void testIsEMail3() {
        boolean result = isEMail("login.gmail.com");
        assertFalse(result);
    }

    @Test
    public void testIsEMail4() {
        boolean result = isEMail("login@gmail.c");
        assertFalse(result);
    }

    @Test
    public void testIsEMail5() {
        boolean result = isEMail("login@gmail.123");
        assertFalse(result);
    }

    @Test
    public void testIsEMail6() {
        boolean result = isEMail("");
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
