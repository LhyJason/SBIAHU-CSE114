
//需求：判断SSN是否合理
//e.g.:xxx-xx-xxxx为合理
import java.util.Scanner;

public class Exercise04_21 {
    public static void main(String[] args) {
        // 1.数据录入
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a SNN: ");
        String s = sc.nextLine();
        if (s.length() != 11) {
            System.out.println(s + " is an invalid social security number");
        } else {
            System.out.println(s + " is a valid social security number");
        }
    }
}