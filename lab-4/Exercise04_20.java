
//需求：打印字符串长度和首字母
import java.util.Scanner;

public class Exercise04_20 {
    public static void main(String[] args) {
        // 1.数据录入
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        //2.打印字符串长度
        System.out.println("The length of the string is " + s.length());

        //3.打印首字母
        char chr = s.charAt(0);
        System.out.println("The first character in the string is " + chr);
    
    }
}