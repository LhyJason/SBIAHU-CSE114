
//需求：遍历字符串并提取偶数位，再返回
import java.util.Scanner;

public class Exercise05_48 {
    public static void main(String[] args) {
        // 数据录入
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        // 遍历字符串并提取偶数位
        String result = "";
        for (int i = 0; i < s.length() - 1; i++) {
            if (i % 2 == 0) {
                result += s.charAt(i + 1);
            }
        }
        System.out.println(result);

    }
}
