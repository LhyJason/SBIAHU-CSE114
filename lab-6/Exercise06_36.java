
//算多边形面积
import java.util.Scanner;

public class Exercise06_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int n = sc.nextInt();
        System.out.print("Enter the side: ");
        double side = sc.nextDouble();
        double area = area(n, side);
        System.out.println("The area of the polygon is " + area);
    }

    // 方法
    public static double area(int n, double side) {
        double result = (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
        return result;
    }
}