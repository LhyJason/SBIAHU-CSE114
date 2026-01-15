
//需求：把两个字符串的重复部分打印
import java.util.Scanner;

public class LargestCommonPrefix {
    public static void main(String[] args) {
        // 录入两个字符串
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = sc.nextLine();

        // 判断
        int temp = s1.length() < s2.length() ? s1.length() : s2.length();
        String s = "";
        boolean flag = true;
        if (s1.charAt(0) != s2.charAt(0)) {
            flag = false;
        }

        if (flag) {
            for (int i = 0; i < temp; i++) {
                if (s1.charAt(i) == s2.charAt(i)) {
                    s += s1.charAt(i);
                }
            }
        }

        if (s.equals("")) {
            System.out.println(s1 + " and " + s2 + " have no common prefix");
        } else {
            System.out.println("The common prefix is: " + s);
        }

    }
}