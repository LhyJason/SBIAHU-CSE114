/*2.6 (Multiply the digits in an integer) Write a program that reads an integer between100 and 999 and multiplies all the digits in the integer. For example, if an integer
is 132, the multiplication of all its digits is 6.
Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
Here is a sample run: */
/*Enter an integer between 100 and 1000: 999 [Enter]
The multiplication of all digits in 999 is 729 */
import java.util.Scanner;
public class Exercise02_06{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer between 100 and 1000: ");
        int number = input.nextInt();
        int onesPlace = number % 10;
        int hundredsPlace = number / 100;
        int tensPlace = (number / 10) - (hundredsPlace * 10);
        int muilti = onesPlace * hundredsPlace * tensPlace;
        input.close();
        System.out.println("The multiplication of all digits in "+ number + "is"  + muilti);
}
}
