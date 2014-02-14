package com.gd.math.utils;

/**
 * Created by dbaskal on 2/13/14.
 */

public class Circle {

    public static double getArea(double R) {
        Double S;
        if (R > 0)
            S = Math.PI * Math.pow(R, 2);
        else
            throw new IllegalArgumentException();
        return S;
    }

    public static double getPerimeter(double R) {
        Double P;
        if (R > 0)
            P = 2 * Math.PI * R;
        else
            throw new IllegalArgumentException();
        return P;
    }
}
