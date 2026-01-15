//需求：求十个数的平均数
import java.util.Scanner;
public class Exercise07_08{
    public static void main(String[] args) {
        //数据录入
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 double values: ");
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextDouble(); 
        }

        //调用并打印
        double average = average(array);
        System.out.println(average);
    }

    //方法
    public static double average(double[] array){
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        result = result / array.length;
        return result;
    }
}