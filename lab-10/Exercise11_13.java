import java.util.Scanner;
import java.util.ArrayList;

public class Exercise11_13 {
    public static void main(String[] args) {
        // create ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // input data and give them to list
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            int number = sc.nextInt();
            list.add(number);
        }

        // method
        removeDuplicate(list);
        System.out.print("The distinct integers are ");
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if(i == list.size()-1){
                System.out.print(number);
            }else{
                System.out.print(number + " ");
            }

        }


    }

    // define method
    /** find number[i] whether duplicate in list */
    public static boolean contains(ArrayList<Integer> list, int number) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)==number){
                return true;
            }
        }

        return false;
    }

    /** method of removing duplicate */
    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            boolean flag = contains(newList,list.get(i));
            if (!flag) {
                newList.add(list.get(i));
            }
        }
        list.clear();
        for (int i = 0; i < newList.size(); i++){
                  list.add(newList.get(i));
        }

  }

    }

    // 不安全 remove
    /** find number[i] whether duplicate in list 利用双重循环 */
    /*
     * public static void removeDuplicate(ArrayList<Integer> list) {
     * ArrayList<Integer> newList = new ArrayList();
     * for (int i = 0; i < list.size(); i++) {
     * for (int j = 0; j < i; j++) {
     * if (list.get(i) == list.get(j)) {
     * newList.remove(list.get(j));
     * }
     * }
     * newList.add(list.get(i));
     * }
     * 
     * System.out.print("The distinct integers are ");
     * for (int i = 0; i < newList.size(); i++) {
     * int number = newList.get(i);
     * System.out.print(number + " ");
     * }
     * 
     * }
     */
