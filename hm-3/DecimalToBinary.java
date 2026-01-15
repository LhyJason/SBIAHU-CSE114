import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        // data input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int value = sc.nextInt();

        // method
        String result = dec2Bin(value);

        // output
        System.out.println(value + "'s binary representation is " + result);
    }

    // method
    /** converts a decimal number into a binary number as a string */
    public static String dec2Bin(int value) {

        StringBuilder sb = new StringBuilder();
        while (value != 0) {
            int r = value % 2;
            value = value / 2;
            sb.append(r);

        }
        String s = sb.reverse().toString();

        return s;
    }
}
