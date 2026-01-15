import java.util.Scanner;
public class Temperature{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //数据录入
        System.out.print("Please enter a temperature between -58 and 41 Fahrenheit:");
        double ta = sc.nextDouble();
        System.out.print("Please enter the wind speed (greater or equal to 2 mph):");
        double v = sc.nextDouble();
        //输出
        double twc = 35.74 + 0.6215 * ta - 35.75 * Math.pow(v,0.16) + 0.4275 * ta * Math.pow(v,0.16);
        System.out.printf("The wind-chill temperature is %.2f Fahrenheit.", twc);
    }
}