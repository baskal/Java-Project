package math.utilite;

/**
 * Created by dbaskal on 2/13/14.
 */
public class Triangle {

        private double a, b, c;

        public boolean isRegular() {
            boolean d = false;
            if (a<=0 || b<=0 || c<=0) {
                System.out.println("Error");
            }
            else {
                if (a == b && a == c) {
                    d = true;
                } else {
                   d = false;
                }
            }
            return d;
        }

        public boolean isRight() {
            boolean d = false;
            if (a<=0 || b<=0 || c<=0) {
                System.out.println("Error");
            }
            else {
                if (a == Math.sqrt(b * b + c * c) || b == Math.sqrt(a * a + c * c) || c == Math.sqrt(b * b + a * a)) {
                    d = true;
                } else {
                    d = false;
                }
            }
            return d;
        }
}

