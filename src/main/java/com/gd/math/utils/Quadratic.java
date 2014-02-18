package com.gd.math.utils;

/**
 * Created by dbaskal on 2/13/14.
 */
public class Quadratic {

        public static Result getSolution(double a, double b, double c) {
            Double x1;
            Double x2;
            double dd = b * b - 4 * a * c;
            double d = Math.round(100000.0 * dd) / 100000.0;
            if (d > 0) {
                x1 = (-b + Math.sqrt(d)) / (2 * a);
                x2 =  (-b - Math.sqrt(d)) / (2 * a);
                Double x11 = Math.round(1000.0 * x1) / 1000.0;
                Double x22 = Math.round(1000.0 * x2) / 1000.0;
                Result result = new Result(x11, x22);
                return result;
            }
            else {
                if (d == 0) {
                    Double x = -b / (2 * a);
                    Double xx = Math.round(1000.0 * x) / 1000.0;
                    Result result = new Result(xx, xx);
                    return result;
                }
                else
                    return null;
            }
        }

}

