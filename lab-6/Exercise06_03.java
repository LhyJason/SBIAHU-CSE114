
//回文数
// 将数字倒过来进行比较看其是否相同
import java.util.Scanner;

public class Exercise06_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 数字输入
        System.out.println("Enter a postive integer: ");
        int number = sc.nextInt();
        boolean result = isPalindrome(number);
        if(result){
          System.out.println(number + " is palindrome");  
        }else{
             System.out.println(number + " is not palindrome");
        }
    
    }

    // 方法
    // 反转数字
    public static int reverse(int number) {
        int reverseNum = 0;
        while (number != 0) {
            int ge = number % 10;
            number /= 10;
            reverseNum = reverseNum * 10 + ge;
        }
        return reverseNum;
    }

    // 比较
    public static boolean isPalindrome(int number) {
        int reverseNumber = reverse(number);
        boolean result = true;
        if (number != reverseNumber) {
            result = false;
        }
        return result;
    }

}