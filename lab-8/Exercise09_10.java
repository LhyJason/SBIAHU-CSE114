import java.util.Scanner;

class QuadraticEquation {
    // 成员变量
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // 成员方法

    /** get number a in double type */
    public double getA() {
        return a;
    }

    /** get number b in double type*/
    public double getB() {
        return b;
    }

    /** get number c in double type*/
    public double getC() {
        return c;
    }

    /** get discriminant */
    public double getDiscriminant() {
        double result = Math.pow(b, 2) - (4 * a * c);
        return result;
    }

    /** get number root1 */
    public double getRoot1() {
        double temp = getDiscriminant();
        if (temp < 0) {
            return Double.NaN;
        } else {
            double r1 = (-b + Math.pow(temp, 0.5)) / (2 * a);
            return r1;
        }

    }

    /** get number root1 */
    public double getRoot2() {
        double temp = getDiscriminant();
        if (temp < 0) {
            return Double.NaN;
        } else {
            double r2 = (-b - Math.pow(temp, 0.5)) / (2 * a);
            return r2;
        }

    }
}

public class Exercise09_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 录入
        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        double temp = qe.getDiscriminant();

        if (temp > 0) {
            double r1 = qe.getRoot1();
            double r2 = qe.getRoot2();
            System.out.println("The roots are " + r1 + " and " + r2);
        } else if (temp == 0) {
            double r1 = qe.getRoot1();
            double r2 = qe.getRoot2();
            System.out.println("The root is " + r1);
        } else {
            System.out.println("The equation has no roots");
        }
    }

}