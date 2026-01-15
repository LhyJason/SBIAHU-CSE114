import java.util.Scanner;
//Enter x1 and y1: 1.5 -3.4 [Enter]
//Enter x2 and y2: 4 5 [Enter]
//The distance of the two points is 8.764131445842194
public class Exercise02_15 {
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter x1 and y1: ");
        double x1 = sc1.nextDouble();
        double y1 = sc1.nextDouble();
        System.out.println("Enter x2 and y2: ");
        double x2 = sc1.nextDouble();
        double y2 = sc1.nextDouble();
        double a = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
        double distance = Math.pow(a, 0.5);
        System.out.println("The distance of the two points is " + distance);
        



    }

}