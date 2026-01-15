//Meadowdale Dairy Farm sells organic brown eggs to local customers. 
//It charges $3.25 for a dozen eggs, or 45 cents for individual eggs that are not part of a dozen. 
//Write aprogram that prompts a user for the number of eggs in the order and then display the amount owed with a full explanation. 
//For example, typical output might be, Youordered 27 eggs. That’s 2 dozen at $3.25 per dozen and 3 loose eggs at 45 cents for atotal of $7.85.
import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of eggs you want to buy: ");
        int eggs = sc.nextInt();
        int dozen = eggs / 12;
        int loose = eggs % 12;
        //分段输出
        if(dozen == 0){
            double price1 = eggs * 0.45; 
            System.out.println("You ordered " + eggs + " eggs.That's " + eggs + " loose eggs at 45 cents for a total of $"+ price1);
        } else if(dozen > 0 && loose != 0) {
            double price2 = dozen * 3.25 + loose * 0.45;
            System.out.println("You ordered " + eggs + " eggs. That's " + dozen + " dozen at $3.25 per dozen and " + loose + " loose eggs at 45 cents for a total of $" + price2);
        }else if(dozen > 0 && loose == 0){
            double price3 = dozen * 3.25;
            System.out.println("You ordered " + eggs + " eggs. That's " + dozen + " dozen at $3.25 per dozen for a total of $" + price3);
        }
    }


}