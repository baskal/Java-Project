package Math_problems;

public class Triangle {
    private double a, b, c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void isRegular() {
        if (a==b && a==c) {
            System.out.println("This triangle is isRegular");
        }
        else {
            System.out.println("This triangle is irregular");
        }
    }

    public void isRight() {
            if (a==Math.sqrt(b*b + c*c) || b==Math.sqrt(a*a + c*c) || c==Math.sqrt(b*b + a*a)) {
                System.out.println("This triangle is isRight");
            }
            else {
                System.out.println("This triangle isn't isRight");
            }
        }
}