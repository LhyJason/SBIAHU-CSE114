//需求：输入两个字符串，判断第二个是第一个的子字符串
import java.util.Scanner;

public class Exercise04_22 {
    public static void main(String[] args) {
        // 1.数据录入
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string s1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter string s2: ");
        String s2 = sc.nextLine();

        //2.进行判断
        if(s1.indexOf(s2) != -1){
            System.out.println(s2 + " is a substring of " + s1);
        }
    }
}
