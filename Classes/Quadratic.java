package Math_problems;

public class Quadratic {
    private double a, b, c;

    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void getSolution() {
        double x1, x2;
        double d = b*b -4*a*c;
        if (d>0) {
            x1 = (-b + Math.sqrt(d))/(2*a);
            x2 =  (-b + Math.sqrt(d))/(2*a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        else if (d==0) {
            x1 = -b/(2*a);
            System.out.println("x1 = x2 = " + x1);
        }
        else System.out.println("Quadratic hasn't real roots");
        }
}