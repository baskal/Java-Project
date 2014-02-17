package com.gd.math.utils;

import java.util.Arrays;

/**
 * Created by dbaskal on 2/13/14.
 */
public class Quadratic {

        public static Object getSolution(double a, double b, double c) {
            Double x1;
            Double x2;
            double dd = b * b - 4 * a * c;
            double d = Math.round(100000.0 * dd) / 100000.0;
            if (d > 0) {
                x1 = (-b + Math.sqrt(d)) / (2 * a);
                x2 =  (-b - Math.sqrt(d)) / (2 * a);
                double [] x = new double[2];
                x[0] = Math.round(1000.0 * x1) / 1000.0;
                x[1] = Math.round(1000.0 * x2) / 1000.0;
                return Arrays.toString(x);
            }
            else {
                if (d == 0) {
                    Double x = -b / (2 * a);
                    return Math.round(1000.0 * x) / 1000.0;
                }
                else
                    throw new IllegalArgumentException("Discriminant mustn't be negative");
            }
        }
}

