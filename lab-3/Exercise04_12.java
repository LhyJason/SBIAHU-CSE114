//需求：十六进制转换为二进制

import java.util.Scanner;

public class Exercise04_12 {
    public static void main(String[] args) {
        // 1.数据录入
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hex character: ");
        String s = sc.next();
        
        String hex = "0123456789ABCDEF";

        // 2. 十六进制转十进制
        int number = hex.indexOf(s);
        if (number >= 0 && number <= 15) {

            // 3. 十进制转换为二进制
            int t = 0;
            int bin = 0;
            while (number != 0) {
                int r = number % 2;
                number = number / 2;
                bin += r * Math.pow(10, t);
                t++;
            }
            System.out.println("The bianry value is " + bin);

        } else {
            System.out.println(s + " is an invalid input");
        }

    }

}
