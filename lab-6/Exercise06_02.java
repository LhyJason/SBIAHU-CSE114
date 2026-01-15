//需求：把数字的各个位数相加
import java.util.Scanner;
public class Exercise06_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        int result = sumDigits(number);
        System.out.print("The sum of digits for " + number + " is " + result);

    }

    // 方法
    public static int sumDigits(long n) {
        int temp = 0;
        while(n != 0){
            temp += n % 10;
            n /= 10; 
        }
        return temp;
    }
}
