
//需求：求六边形面积
import java.util.Scanner;

public class Exercise04_04 {
    public static void main(String[] args) {
        // 1.数据录入
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double s = sc.nextDouble();

        // 公式运算并输出
        double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));
        System.out.println("The area of the hexagon is " + area);

    }
}