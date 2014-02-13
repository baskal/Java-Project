package mathProblems;

public class Triangle {
    private double a, b, c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void isRegular() {
        if (a<=0 || b<=0 || c<=0) {
            System.out.println("Incorrect value for a, b, c");
        }
        else {
            if (a == b && a == c) {
                System.out.println("This triangle is regular");
            } else {
                System.out.println("This triangle is irregular");
            }
        }
    }

    public void isRight() {
        if (a<=0 || b<=0 || c<=0) {
            System.out.println("Incorrect value for a, b, c");
        }
        else {
            if (a == Math.sqrt(b * b + c * c) || b == Math.sqrt(a * a + c * c) || c == Math.sqrt(b * b + a * a)) {
                System.out.println("This triangle is right");
            } else {
                System.out.println("This triangle isn't right");
            }
        }
    }
}