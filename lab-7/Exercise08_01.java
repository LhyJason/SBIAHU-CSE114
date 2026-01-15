
//需求：对矩阵的行求和
import java.util.Scanner;

public class Exercise08_01 {
    public static void main(String[] args) {
        // 数据录入
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3 by 4 matrix row by row: ");
        double[][] m = new double[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = sc.nextDouble();
            }
        }

        // 方法调用
        for (int rowIndex = 0; rowIndex < 3; rowIndex++) {
            double sum = sumRow(m, rowIndex);
            System.out.println("Sum of the elements at row " + rowIndex + " is " + sum);
        }

    }

    // 定义方法 求和
    public static double sumRow(double[][] m, int rowIndex) {
        double sum = 0;
        for (int j = 0; j < 4; j++) {
            sum += m[rowIndex][j];
        }

        return sum;

    }
}
