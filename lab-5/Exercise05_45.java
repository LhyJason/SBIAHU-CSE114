
//需求：求均值和标准差

import java.util.Scanner;

public class Exercise05_45 {
    public static void main(String[] args) {
        // 1.数据录入
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        double[] x = new double[10];
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextDouble();
        }

        // 方法调用
        double main = arrayMain(x);
        System.out.println("The mean is " + main);
        double standardDeviation = arrayStandardDeviation(x, main);
        System.out.println("The standard deviation is " + standardDeviation);

    }

    // 方法：公式套用
    // 1.求均值
    public static double arrayMain(double x[]) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        double main = sum / x.length;
        return main;
    }

    // 2.求方差
    public static double arrayStandardDeviation(double x[], double main) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += Math.pow(x[i], 2);
        }
        double a = sum / (x.length -1);
        double b = Math.pow(main * x.length, 2) /(x.length * (x.length - 1));
        double standardDeviation = Math.pow( a - b, 0.5);
        return standardDeviation;

    }
}
/*
 * System.out.print("Enter 10 numbers: ");
 * double n1 = sc.nextDouble();
 * double n2 = sc.nextDouble();
 * double n3 = sc.nextDouble();
 * double n4 = sc.nextDouble();
 * double n5 = sc.nextDouble();
 * double n6 = sc.nextDouble();
 * double n7 = sc.nextDouble();
 * double n8 = sc.nextDouble();
 * double n9 = sc.nextDouble();
 * double n10 = sc.nextDouble();
 * 
 * // 2.公式运用
 * 
 * double mean = (n1 + n2 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10) / 10;
 * double standardDeviation = (Math.pow(n1, 2) + Math.pow(n1, 2) + n2 + n3 + n4
 * + n5 + n6 + n7 + n8 + n9 + n10);
 * / 10;
 */
