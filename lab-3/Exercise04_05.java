
//需求：求n边形面积
import java.util.Scanner;

public class Exercise04_05 {
    public static void main(String[] args) {
        // 1.数据录入
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        double ns = sc.nextDouble();
        System.out.print("Enter the side: ");
        double s = sc.nextDouble();

        // 2.公式运算并输出
        double area = (ns * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / ns));
        System.out.println("The area of the polygon is " + area);

    }
}