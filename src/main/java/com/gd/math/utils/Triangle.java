package com.gd.math.utils;

/**
 * Created by dbaskal on 2/13/14.
 */
public class Triangle {

        public static boolean isRegular(double a, double b, double c) {
            boolean d = false;
            if (a<=0 || b<=0 || c<=0 || c>=a+b || a>=b+c || b>=a+c)
                throw new IllegalArgumentException();
            else {
                if (a == b && a == c)
                    d = true;
                else d = false;
            }
            return d;
        }

        public static boolean isRight(double a, double b, double c) {
            boolean d = false;
            if (a<=0 || b<=0 || c<=0 || c>=a+b || a>=b+c || b>=a+c)
                throw new IllegalArgumentException();
            else {
                if (a == Math.sqrt(b * b + c * c) || b == Math.sqrt(a * a + c * c) || c == Math.sqrt(b * b + a * a))
                    d = true;
                else d = false;
            }
            return d;
        }
}


