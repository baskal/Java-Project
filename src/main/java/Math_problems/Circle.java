package Math_problems;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double S = 0;
        if (radius < 0) {
            System.out.println("Incorrect value for the radius");
        }
        else {
            S = Math.PI * Math.pow(radius, 2);
        }
        return S;
    }

    public double getPerimeter() {
        double P = 0;
        if (radius < 0) {
            System.out.println("Incorrect value for the radius");
        } else {
            P = 2 * Math.PI * radius;
        }
        return P;
    }
    public double getRadius() {
        return radius;
    }
}
