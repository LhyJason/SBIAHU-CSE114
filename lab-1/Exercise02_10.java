/*Exercise02_10.java
2.10 (Science: calculating energy) Write a program that calculates the energy needed to 
heat water from an initial temperature to a final temperature. Your program should prompt
the user to enter the amount of water in kilograms and the initial and final temperature 
of the water. The formula to compute the energy is
Q =M∗(finalTemperature−initialTemperature)∗4184
Where M is the weight of water in kilograms, initial and final temperatures are
 in degree Celsius, and energy Q is in joules. Here is a sample run: */
/*Enter the amount of water in kilograms: 55.5 Enter the initial temperature: 3.5 
Enter the final temperature: 10.5 
The energy needed is 1625484.0  */

import java.util.Scanner;
public class Exercise02_10{
    public static void main(String[] args){
    Scanner input1 = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    Scanner input3 = new Scanner(System.in);
    System.out.println("Enter the amount of water in kilograms: ");
    System.out.println("Enter the initial temperature: ");
    System.out.println("Enter the final temperature: ");
    double water = input1.nextDouble();
    double initial = input1.nextDouble();
    double finall = input1.nextDouble();
    double result = water * (finall - initial) * 4184;
    System.out.println("The energy needed is " + result);
    }









}