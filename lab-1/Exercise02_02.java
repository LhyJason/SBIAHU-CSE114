import java.util.Scanner;
public class Exercise02_02{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of the sides and height of the equilateral triangle: ");
        double sides = input.nextDouble();
        double height = input.nextDouble();
        double area = Math.sqrt(3) / 4 * sides * sides;
        double volume = area * height;
        System.out.printf("The area is %.3f \n", area);
        System.out.printf("The volume of the triangular prism is %.3f", volume);
        input.close();
        //The area is 3.897 The volume of the triangular prism is 19.4863
    }



}
