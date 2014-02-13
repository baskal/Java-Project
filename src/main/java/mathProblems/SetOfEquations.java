package mathProblems;

import java.util.Scanner;

public class SetOfEquations {
    private double a1, b1, c1, a2, b2, c2;

    public SetOfEquations(){
    }

    public void getSolution() {
        double d, d1, d2, x1, x2;
        System.out.println ("Enter the coefficients (ai*x1 + bi*x2 + ci = 0)");
        Scanner s = new Scanner(System.in);
        System.out.print("a1 = ");
        a1 = s.nextFloat();
        System.out.print("b1 = ");
        b1 = s.nextFloat();
        System.out.print("c1 = ");
        c1 = s.nextFloat();
        System.out.print("a2 = ");
        a2 = s.nextFloat();
        System.out.print("b2 = ");
        b2 = s.nextFloat();
        System.out.print("c2 = ");
        c2 = s.nextFloat();
        d = a1*b2 - a2*b1;
        d1 = c1*b2 - c2*b1;
        d2 = a1*c2 - a2*c1;
        if (d!=0) {
            x1 = d1/d;
            x2 = d2/d;
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        else if (c1==c2 && c1==0) {
            System.out.println("The set of equations has infinitely many solutions");
        }
        else System.out.println("The set of equations hasn't getSolution");
        }
}
