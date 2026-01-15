import java.util.Scanner;
public class Triangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //数据录入
        System.out.print("Side1:");
        double side1 = sc.nextDouble();
        System.out.print("Side2:");
        double side2 = sc.nextDouble();
        System.out.print("Side3:");
        double side3 = sc.nextDouble();
        //三角形判断
        double max = side1 > side2 ? side1 : side2;
        max = max > side3 ? max : side3;

        double min = side1 < side2 ? side1 : side2;
        max = max < side3 ? max : side3;

        double mid = side1 + side2 + side3 - max - min;
        
        boolean result = min + mid > max;

        //分类
        if(result == false){
            System.out.println("Output: Invalid input!");
        }else{
            if(side1 == side2 && side2 == side3){
                System.out.println("Output: Equilateral");
            }else if (side1 == side2 || side2 == side3 || side1 == side3){
                System.out.println("Output: Isosceles");
            }else{
                System.out.println("Output: Scalene");
            }
        }


    }
}