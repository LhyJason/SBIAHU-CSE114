/*(Health application: computing BMI) Body Mass Index (BMI) is a measure of healthon weight. 
It can be calculated by taking your weight in kilograms and dividing, by the square of your height in meters. 
Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI. 
Note one pound is 0.45359237 kilograms and one inch is 0.0254 meters. */
//Enter weight in pounds: 95.5 [Enter]
//Enter height in inches: 50 [Enter] 
//BMI is 26.857257942215885
import java.util.Scanner;
public class Exercise02_14{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        System.out.println("Enter height in inches: ");
        double weight = input.nextDouble();
        double height = input.nextDouble();
        double kilograms = weight * 0.45359237;
        double meters = height * 0.0254;
        double BMI = kilograms / (meters * meters);
        System.out.println("BMI is " + BMI);





    }




}