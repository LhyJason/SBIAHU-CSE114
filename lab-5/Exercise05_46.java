
//需求：遍历字符串并反转，再返回
import java.util.Scanner;

public class Exercise05_46 {
    public static void main(String[] args) {
        // 数据录入
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String rs = reverseString(s);
        System.out.print("The reversed string is " + rs);

    }

    public static String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();

    }
}