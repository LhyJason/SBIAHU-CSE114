
//需求：判断是否是Armstrong
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        // 给出上下限
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int numberLower = sc.nextInt();
        System.out.print("Enter the upper limit: ");
        int numberUpper = sc.nextInt();

        // 循环得到数字传递给方法
        System.out.print("The Armstrong numbers between " + numberLower + " and " + numberUpper + " are: ");
        for (int i = numberLower; i < numberUpper; i++) {
            // 调用方法 进行检测
            boolean flag = isArmstrong(i);
            if (flag) {
                System.out.print(i + " ");
            }
        }
    }

    // 方法定义
    /** 判断是否是Armstrong */
    public static boolean isArmstrong(int number) {
        int count = 0;
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        temp = number;
        int temp1 = 0;
        int temp2 = 0;
        while (temp != 0) {
            temp1 = temp % 10;
            temp2 += Math.pow(temp1, count);
            temp /= 10;
        }

        return temp2 == number;

    }
}