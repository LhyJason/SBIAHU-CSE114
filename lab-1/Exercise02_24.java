import java.util.Scanner;

public class Exercise02_24{
	public static void main(String[] args) {
		Scanner convertion = new Scanner(System.in);
		//System.out.println("please give temperature in Celsius");
		double celsius = convertion.nextDouble();
		double fahrenheit = (9.0/5) * celsius + 32;
		System.out.println("Enter a temperature in Celsius: " + celsius + " Celsius is " + fahrenheit + " Fahrjjenheit");
	}	
}