
import java.util.Scanner;

public class Exercise08_05 {
    public static void main(String[] args) {
        // 数据录入
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix1: ");
        double[][] maxtrix1 = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                maxtrix1[i][j] = sc.nextDouble();
            }
        }
        System.out.print("Enter matrix2: ");
        double[][] maxtrix2 = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                maxtrix2[i][j] = sc.nextDouble();
            }
        }

        // 调用

        double[][] sum = addMatrix(maxtrix1, maxtrix2);
        System.out.println("The addition of the matrices is");
        printResult(maxtrix1, maxtrix2, sum, (char)0);

    }

    // 方法定义
    // 求和
    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] sum = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }

    // 打印
    public static void printResult(double[][] matrix1, double[][] matrix2, double[][] sum, char x) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++)
                System.out.print(" " + matrix1[i][j]);

            if (i == matrix1.length / 2)
                System.out.print("  " + x + "  ");
            else
                System.out.print("     ");

            for (int j = 0; j < matrix2[0].length; j++)
                System.out.print(" " + matrix2[i][j]);

            if (i == matrix1.length / 2)
                System.out.print("  =  ");
            else
                System.out.print("     ");

            for (int j = 0; j < sum[0].length; j++)
                System.out.print(" " + sum[i][j]);

            System.out.println();
        }
    }
}
