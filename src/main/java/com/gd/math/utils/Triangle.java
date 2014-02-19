package com.gd.math.utils;

/**
 * Created by dbaskal on 2/13/14.
 */
public class Triangle {

    public static boolean isRegular(double a, double b, double c) {
        isTriangle(a, b, c);
        return a == b && a == c;
    }
    public static boolean isRight(double a, double b, double c) {
        isTriangle(a, b, c);
        return a == Math.sqrt(b * b + c * c) || b == Math.sqrt(a * a + c * c) || c == Math.sqrt(b * b + a * a);
    }

    private static void isTriangle(double a, double b, double c){
        if (a <= 0 || b <= 0 || c <= 0)
            throw new IllegalArgumentException("A, b, c must be positive");
        else
        if (c >= a + b || a >= b + c || b >= a + c)
            throw new IllegalArgumentException("The triangle inequality is not satisfied");
    }
}