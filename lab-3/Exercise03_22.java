
//需求：判断点（x，y）是否在圆心在原点，半径为10的圆里面
import java.util.Scanner;

public class Exercise03_22 {
    public static void main(String[] args){
        //1.数据录入
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        //临时变量
        double temp = Math.pow(x, 2) + Math.pow(y, 2);

        //2.；利用距离进行判断
        if(Math.pow(temp,0.5) <= 10){
            System.out.println("Point (" + x +", " + y +") is in the circle" );
        }else{
            System.out.println("Point (" + x +", " + y +") is not in the circle" );
        }

    }
}