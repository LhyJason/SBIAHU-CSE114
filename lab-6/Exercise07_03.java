import java.util.Scanner;

public class Exercise07_03 {
  public static void main(String[] args) {
    // 数据录入
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[50];
    System.out.print("Enter the integers between 1 and 50: ");
    
    // 读数字，并判断是否合理
    int number = sc.nextInt();
    while (number != 0) {
      if (number <= 50 && number > 0) {
        arr[number - 1]++;
      }
      number = sc.nextInt();
    }

    // 输出
    for (int i = 0; i < 50; i++) {
      if (arr[i] > 0) {
        System.out.println((i + 1) + " occurs " + arr[i] + ((arr[i] == 1) ? " time" : " times"));
      }
    }

  }
}
