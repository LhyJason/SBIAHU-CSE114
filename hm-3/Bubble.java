import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        // data input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        double[] list = new double[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextDouble();
        }

        // method
        bubbleSort(list);

        // output
        System.out.print("The sorted array is: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

    }

    /** to sort an array of integers using bubble-sort algorithm */
    static void bubbleSort(double[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                boolean flag = list[i] < list[j];
                // change elements
                if (!flag) {
                    double temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }

        }
    }
}