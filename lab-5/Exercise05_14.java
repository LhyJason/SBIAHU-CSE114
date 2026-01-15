//需求：找两个数字的最大公约数
import java.util.Scanner;


public class Exercise05_14 {
    public static void main(String[] args) {
        //数据录入
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        //取两数最小值
        int min = Math.min(number1,number2);
        //int min = number1 > number2 ? number2 : number1;

        for (int i = min; i >= 0; i--) {
            if(number1 % i == 0 && number2 % i == 0){
                System.out.println("GCD of " + number1 + " and " + number2 + " is " + i);
                break;
            }
        }

        }
    }
