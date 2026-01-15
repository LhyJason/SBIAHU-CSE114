import java.util.Scanner;

public class Exercise02_01{
	public static void main(String[] args) {
		Scanner convertion = new Scanner(System.in);
		//System.out.println("please give miles");
		double miles = convertion.nextDouble();
		double kilometers = 1.6 * miles;
		System.out.println("Enter miles: " + miles + " miles is " + kilometers + " kilometers");
	}	
}