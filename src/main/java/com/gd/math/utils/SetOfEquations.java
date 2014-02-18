package com.gd.math.utils;


/**
 * Created by dbaskal on 2/13/14.
 */
public class SetOfEquations {

    public static Result getSolutionOfSet(double a1, double b1, double c1, double a2, double b2, double c2) {
        Double x1;
        Double x2;
        double dd = a1 * b2 - a2 * b1;
        double d = Math.round(100000.0 * dd) / 100000.0;
        double dd1 = -c1 * b2 + c2 * b1;
        double d1 = Math.round(100000.0 * dd1) / 100000.0;
        double dd2 = -a1 * c2 + a2 * c1;
        double d2 = Math.round(100000.0 * dd2) / 100000.0;
        if (d!=0) {
            x1 = d1 / d;
            x2 = d2 / d;
            Double x11 = Math.round(1000.0 * x1) / 1000.0;
            Double x22 = Math.round(1000.0 * x2) / 1000.0;
            Result result = new Result(x11, x22);
            return result;
        }
        else {
            return null;
        }
    }
}
