
import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {
        // data input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter list1 size and contents: ");
        int[] list1 = createList(sc);
        System.out.print("Enter list2 size and contents: ");
        int[] list2 = createList(sc);

        // merge(method)
        int[] result = merge(list1, list2);

        //output
        System.out.print("The merged list is: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }


    }

    /** to create list */
    public static int[] createList(Scanner sc) {
        int size = sc.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        return list;
    }

    /** merges two sorted lists into a new sorted list */
    public static int[] merge(int[] list1, int[] list2) {
        // initial virable
        int number = list1.length + list2.length;
        int[] list = new int[number];

        // add element
        for (int i = 0; i < list1.length; i++) {
            list[i] = list1[i];
        }
        for (int i = 0; i < list2.length; i++) {
            list[i + list1.length] = list2[i];
        }

        // sort
        bubbleSort(list);
        return list;

    }

    /** to sort an array of integers using bubble-sort algorithm */
    static void bubbleSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                boolean flag = list[i] < list[j];
                // change elements
                if (!flag) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }

        }
    }
}
