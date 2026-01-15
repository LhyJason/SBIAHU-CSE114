
//需求：回文字符判断
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // 字符串录入
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        // 调用，输出
        boolean flag = isPalindrome(s);
        if (flag) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome ");
        }
    }

    // 方法

    /** 反转字符串并将其空格去除 */
    public static String reverseString(String str) {
        String s = new StringBuffer(str).reverse().toString();
        String newS = s.replace(" ", "");
        return newS;
    }

    /** 判断目标字符串是否是回文字符串，并返回boolean值的结果给主控制台 */
    static boolean isPalindrome(String str) {
        String s1 = reverseString(str);
        String s2 = str.replace(" ", "");
        if (s2.equalsIgnoreCase(s1)) {
            return true;
        } else {
            return false;
        }
    }

}