package com.gd.math.utils;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by dbaskal on 2/13/14.
 */
public class Quadratic {

        public static List<Double> getSolution(double a, double b, double c) {
            Double x1;
            Double x2;
            double d = b*b -4*a*c;
            if (d>0) {
                x1 = (-b + Math.sqrt(d))/(2*a);
                x2 =  (-b - Math.sqrt(d))/(2*a);
            }
            else {
                if (d==0)
                    x1 = x2 = -b/(2*a);
                else
                    throw new IllegalArgumentException();
            }
            LinkedList list = new LinkedList();
            list.add(x1);
            list.add(x2);
        return list;
        }
}

