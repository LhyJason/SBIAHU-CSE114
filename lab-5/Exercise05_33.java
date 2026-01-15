
//需求：判断是否是完美数字

import java.util.Scanner;

public class Exercise05_33 {
    public static void main(String[] args) {
        // 1.数据录入
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = sc.nextInt();
        int temp = getSum(number);// 调用方法

        // 2.判断并输出
        if (temp == number) {
            System.out.println(number + " is a perfect number! ");
        } else {
            System.out.println(number + " is not a perfect number! ");
        }

    }

    // 方法:将数字的每一个因数相乘
    public static int getSum(int num) {
        int result = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                result += i;
            }
        }
        return result;

    }
}
