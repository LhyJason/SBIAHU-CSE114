
//需求：找最大值
import java.util.Scanner;

public class Exercise07_09 {
    public static void main(String[] args) {
        // 数据录入
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextDouble();
        }

        // 调用并打印
        double max = max(array);
        System.out.println("The maximum number is " + max);
    }

    // 方法
    public static double max(double[] array) {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            max = max > array[i] ? max : array[i];
        }
        return max;
    }
}