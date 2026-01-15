//需求：判断奇偶数
import java.util.Scanner;
public class Exercise03_35{
    public static void main(String[] args){
        //1.数据录入
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        //2.奇偶数判断
        if(number % 2 == 0){
            System.out.println(number + " is an even number");
        }else{
            System.out.println(number + " is an odd number");
        }

    }

}