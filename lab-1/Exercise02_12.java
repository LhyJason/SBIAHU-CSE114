import java.util.Scanner;

public class Exercise02_12{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //System.out.println("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();
        double minimumalLength = (speed * speed) / (2 * acceleration);
        System.out.printf("Enter speed and acceleration: The minimum runway length for this airplane is %.3f meters", minimumalLength); 
        
    }

}