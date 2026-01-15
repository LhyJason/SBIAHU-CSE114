
//需求:检测数组重复并将其未重复部分提取，再打印输出
import java.util.Scanner;

public class Exercise07_15 {
  public static void main(String[] args) {
    // 数据录入
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter ten numbers: ");
    int[] list = new int[10];
    for (int i = 0; i < list.length; i++) {
      list[i] = sc.nextInt();
    }

    // 调用
    int[] result = eliminateDuplicates(list);
    System.out.print("The distinct numbers are: ");
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i]+" ");
    }

  }

  public static boolean contains(int[] list, int temp) {
    for (int i = 0; i < list.length; i++) {
      if (list[i] == temp)
        return true;
    }
    return false;
  }

  public static int[] eliminateDuplicates(int[] list) {
    int[] newList = new int[10];
    int count = 0;
    for (int i = 0; i < list.length; i++) {
      boolean flag = contains(newList, list[i]);
      if (!flag) {
        newList[count] = list[i];
        count++;
      }
    }
    int[] result = new int[count];
    for (int i = 0; i < count; i++) {
      result[i] = newList[i];
    }
    return result;

  }

}

/*
 * 
 * public class Exercise07_15 {
 * public static void main(String[] args) {
 * int[] numbers = new int[10];
 * 
 * java.util.Scanner input = new java.util.Scanner(System.in);
 * System.out.print("Enter ten integers: ");
 * 
 * for (int i = 0; i < numbers.length; i++) {
 * // Read and store numbers in an array if it is new
 * numbers[i] = input.nextInt();
 * }
 * 
 * int[] result = eliminateDuplicates(numbers);
 * 
 * System.out.println(
 * "The number of distinct integers is " + result.length);
 * System.out.print("The distinct integers are ");
 * for (int e: result)
 * System.out.print(e + " ");
 * }
 * 
 * public static int[] eliminateDuplicates(int[] numbers) {
 * int[] temp = new int[numbers.length];
 * int size = 0;
 * for (int i = 0; i < numbers.length; i++) { // For each number in numbers
 * array
 * if (linearSearch(temp, numbers[i]) == -1) {
 * temp[size] = numbers[i]; // Add numbers[i] into temp
 * size++;
 * }
 * }
 * 
 * // Copy the actual number of elements from temp to result
 * int[] result = new int[size];
 * for (int i = 0; i < size; i++)
 * result[i] = temp[i];
 * 
 * return result;
 * }
 * 
 * /** The method for finding a key in the list
 */
/*
 * public static int linearSearch(int[] list, int key) {
 * for (int i = 0; i < list.length; i++) {
 * if (key == list[i])
 * return i;
 * }
 * return -1;
 * }
 * }
 * 
 */