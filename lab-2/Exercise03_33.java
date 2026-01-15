import java.util.Scanner;
public class Exercise03_33{
    public static void main(String[] args){
        //数据录入
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight and price for package 1: ");
        double w1 = sc.nextDouble();
        double p1 = sc.nextDouble();
        System.out.print("Enter weight and price for package 2: ");
        double w2 = sc.nextDouble();
        double p2 = sc.nextDouble();
        //谁大谁好
        //比较
        double a1 = w1 / p1;
        double a2 = w2 / p2;
        double max = a1 > a2 ? a1 : a2;
        if(max == a1){
            System.out.println("Package 1 has a better price.");
        }else{
            System.out.println("Package 2 has a better price.");
        }
        




    }




}