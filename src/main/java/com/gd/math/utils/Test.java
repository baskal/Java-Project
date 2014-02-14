package com.gd.math.utils;

import static com.gd.math.utils.Circle.getArea;
import static com.gd.math.utils.Circle.getPerimeter;
import static com.gd.math.utils.Quadratic.getSolution;
import static com.gd.math.utils.SetOfEquations.getSolutionOfSet;
import static com.gd.math.utils.Triangle.isRegular;
import static com.gd.math.utils.Triangle.isRight;

/**
 * Created by dbaskal on 2/14/14.
 */
public class Test {
    public static void main(String[] args) {
        //System.out.println(getSolutionOfSet(3, 9, 0, 1, 4, 5));
        System.out.println(getSolution(1, -2, 1));
        //System.out.println(isRight(3, 10, 5));
        //System.out.println(getArea(1));
    }
}
