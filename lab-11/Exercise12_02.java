import java.util.Scanner;

public class Exercise12_02 {

    public static void main(String[] args) {
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 12:");

        try {
            int number = sc.nextInt();
            if (number > 12 || number < 1) {
                throw new ArrayIndexOutOfBoundsException("wrong number");
            }
            System.out.println("The month is " + months[number - 1]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("wrong number");
        }

    }

}
