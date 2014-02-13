package math.utilite;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by dbaskal on 2/13/14.
 */
public class SetOfEquations {

    public static List<Double> getSolution(double a1, double b1, double c1, double a2, double b2, double c2) {
        double d;
        double d1;
        double d2;
        double x1 = 0;
        double x2 = 0;
        d = a1*b2 - a2*b1;
        d1 = c1*b2 - c2*b1;
        d2 = a1*c2 - a2*c1;
        if (d!=0) {
            x1 = d1/d;
            x2 = d2/d;
        }
        /*else if (c1==c2 && c1==0) {
            System.out.println("The set of equations has infinitely many solutions");
        }
        else System.out.println("The set of equations hasn't getSolution");
    }*/
    LinkedList list = new LinkedList();
    list.add(x1);
    list.add(x2);
    return list;
}

    public static void main(String [] args){
        System.out.println(getSolution(3, 9, 0, 1, 3, 5));
    }
}
