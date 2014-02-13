package math.utilite;

/**
 * Created by dbaskal on 2/13/14.
 */

public class Circle {

    public double R;

    public static double getArea(double R) {
        double S = 0;
        if (R > 0)
            S = Math.PI * Math.pow(R, 2);
        return S;
    }

    public static double getPerimeter(double R) {
        double P = 0;
        if (R > 0)
            P = 2 * Math.PI * R;
        return P;
    }

    public static void main(String [] args){
        System.out.println(getPerimeter(5));
    }
}
