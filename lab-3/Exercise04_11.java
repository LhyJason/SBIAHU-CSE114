//需求：十进制转换成十六进制
//十六进制位数表:0123456789ABCDEF

import java.util.Scanner;

public class Exercise04_11 {
    public static void main(String[] args) {
        // 1.数据录入
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal value(0 to 15): ");
        int x = sc.nextInt();
        int temp = x % 16;

        // 2.判断并进行转换
        if (x >= 0 && x < 16) {
            String hex = "0123456789ABCDEF";// 十六进制位数表
            char result = hex.charAt(temp);
            System.out.println("The hex value is " + result);
        } else {
            System.out.println(x + " is an invalid input");
        }

    }
}