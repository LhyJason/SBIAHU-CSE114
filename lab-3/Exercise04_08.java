//需求：打印字母对应在ASCII的值

import java.util.Scanner;

public class Exercise04_08 {
   public static void main(String[] args) {
        // 1.数据录入
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");

         String s = sc.nextLine();
        //char chr = s.charAt(0);
        // 优点：后面可以再次使用

        //char chr = sc.next().charAt(0); // 优点：简洁

        // 2.输出
        int asciiChr = (int) s;// 强制转换
        System.out.println("The ASCII for the character " + s + " is " + asciiChr);
    }
}