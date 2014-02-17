package com.gd.math.utils;

/**
 * Created by dbaskal on 2/13/14.
 */

public class Circle {

    public static double getArea(double R) {
        if (R <= 0)
            throw new IllegalArgumentException("Radius must be positive");
        else
            return Math.PI * Math.pow(R, 2);
    }

    public static double getPerimeter(double R) {
        if (R <= 0)
            throw new IllegalArgumentException("Radius must be positive");
        else
            return 2 * Math.PI * R;
    }
}
