import java.util.Scanner;
public class Divisible{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //数据录入
        System.out.print("Enter an integer:");
        int number = sc.nextInt();
        //整除判断变量
        int d5 = number % 5;
        int d6 = number % 6;
        
        
        //判断
      
        boolean result1 = d5 == 0 && d6 == 0;
        System.out.println("Is " + number + " divisible by 5 and 6? " + result1);

        boolean result2 = d5 == 0 || d6 == 0;
        System.out.println("Is " + number + " divisible by 5 or 6? " + result2);

        boolean result3 = d5 == 0 ^ d6 == 0;
        System.out.println("Is " + number + " divisible by 5 or 6? but not both? " + result3);
  
    }
}