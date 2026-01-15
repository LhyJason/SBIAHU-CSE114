import java.util.Scanner;

public class Exercise03_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three-digit integer: ");
        int number = sc.nextInt();
        int ge = number % 10;
        int bai = number / 100 % 10;

        // 条件语句判断
        if (ge == bai) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }

    }

}