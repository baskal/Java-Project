package com.gd.math.utils;

/**
 * Created by dbaskal on 2/13/14.
 */

public class Circle {

    public static double getArea(double R) {
        isRPositive(R);
        return Math.PI * Math.pow(R, 2);
    }

    public static double getPerimeter(double R) {
        isRPositive(R);
        return 2 * Math.PI * R;
    }

    private static void isRPositive(double R) {
        if (R <= 0)
            throw new IllegalArgumentException("Radius must be positive");
    }
}
