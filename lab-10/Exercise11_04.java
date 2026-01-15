import java.util.Scanner;
import java.util.ArrayList;


public class Exercise11_04 {
    public static void main(String[] args) {
        // create ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // input data and give them to list
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integers (input ends with 0): ");
        while (true) {
   
            int temp = sc.nextInt();
            if (temp != 0) {
                list.add(temp);
            } else {
                break;
            }
        }

        // traverse to find maxiumum(method)
        int max = max(list);
        System.out.println("The maximum number is "+ max);
    }

    /** method of finding maxiumum in the list */
    public static Integer max(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            max = max > list.get(i) ? max : list.get(i);
        }
        return max;
    }
}