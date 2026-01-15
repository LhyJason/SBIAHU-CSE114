import java.util.Scanner;
public class Exercise03_01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double panbieshi = (b * b) - 4 * a * c;

        //结果计算
        double r1 = (-b + Math.pow(panbieshi,0.5)) / (2*a);
        double r2 = (-b - Math.pow(panbieshi,0.5)) / (2*a);

        //条件语句判断
        if (panbieshi < 0){
            System.out.println("The equation has no real roots");
        }else if(panbieshi == 0){
            System.out.println("The equation has one roots " + r1);
        }else{
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        }
    }


}