package com.gd.math.utils;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by dbaskal on 2/13/14.
 */
public class SetOfEquations {

    public static List<Double> getSolutionOfSet(double a1, double b1, double c1, double a2, double b2, double c2) {
        double d;
        double d1;
        double d2;
        Double x1 = null;
        Double x2 = null;
        LinkedList list = new LinkedList();
        d = a1*b2 - a2*b1;
        d1 = -c1*b2 + c2*b1;
        d2 = -a1*c2 + a2*c1;
        if (d!=0) {
            x1 = d1/d;
            x2 = d2/d;
            list.add(x1);
            list.add(x2);
        }
        else
            throw new IllegalArgumentException();
    return list;
    }
}
