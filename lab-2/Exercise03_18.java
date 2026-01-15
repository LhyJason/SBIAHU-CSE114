import java.util.Scanner;
public class Exercise03_18{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter package weight: ");
        //w: weight
        double w = sc.nextDouble();
        //分段函数
        if(w <= 1){
            System.out.println("The shipping cost is $3.5");
        }else if(w > 1 && w <= 3){
            System.out.println("The shipping cost is $5.5");
        }else if(w > 3 && w <= 10){
            System.out.println("The shipping cost is $8.5");
        }else if((w > 10 && w <= 20)){
            System.out.println("The shipping cost is $10.5");
        }


    }


}