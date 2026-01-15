
//需求：求均值和标准差

import java.util.Scanner;

public class Exercise07_11 {
    public static void main(String[] args) {
        // 1.数据录入
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        double[] x = new double[10];
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextDouble();
        }

        // 方法调用
        double mean = mean(x);
        System.out.println("The mean is " + mean);
        double standardDeviation = deviation(x);
        System.out.println("The standard deviation is " + standardDeviation);

    }

    // 方法：公式套用
    // 1.求均值
    public static double mean(double x[]) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        double mean = sum / x.length;
        return mean;
    }

    // 2.求方差
    public static double deviation(double x[]) {
        double sum = 0;
        double mean = mean(x);
        for (int i = 0; i < x.length; i++) {
            sum += Math.pow(x[i], 2);
        }
        double a = sum / (x.length -1);
        double b = Math.pow(mean * x.length, 2) /(x.length * (x.length - 1));
        double standardDeviation = Math.pow( a - b, 0.5);
        return standardDeviation;

    }
}