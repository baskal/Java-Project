package math.utilite;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by dbaskal on 2/13/14.
 */
public class Quadratic {

        public static List<Double> getSolution(double a, double b, double c) {
            double x1 = 0, x2 = 0;
            double d = b*b -4*a*c;
            if (d>0) {
                x1 = (-b + Math.sqrt(d))/(2*a);
                x2 =  (-b + Math.sqrt(d))/(2*a);
            }
            else if (d==0) {
                x1 = x2 = -b/(2*a);
            }
            LinkedList list = new LinkedList();
        list.add(x1);
        list.add(x2);
        return list;
        }

    public static void main(String [] args){
        System.out.println(getSolution(3, 9, 5));
    }
}

