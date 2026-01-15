/*2.9 (Physics: acceleration) Average acceleration is defined as the change of velocity
divided by the time taken to make the change, as given by the following formula:
a = (v1-v0)/t
Write down a program that prompts the user to enter the starting velocity v_0 in
meters/second, the ending velocity v_1 in meters/second, and the time span t in
seconds, then display the average acceleration. Here is the sample run:
Enter v0, v1 and t:
The average acceleration is 10.0889 */
import java.util.Scanner;
public class Exercise02_09{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter v0, v1 and t: ");
        double v_0 = input.nextDouble();
        double v_1 = input.nextDouble();
        double t = input.nextDouble();
        double a = (v_1 - v_0) / t;
        System.out.printf("The average acceleration is %.4f",a);
        
      }


}