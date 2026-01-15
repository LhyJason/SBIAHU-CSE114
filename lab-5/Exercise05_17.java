//需求：打印三角形
import java.util.Scanner;

public class Exercise05_17 {
    public static void main(String[] args) {
        // 数据录入
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int lineNumber = sc.nextInt();

        // 输出三角形
        int count = 1;
        for (int i = 1; i <= lineNumber; i++) {
            int an = 2 * (lineNumber - i) + 1;

            // 打印空格
            for (int j = 1; j <= an - i; j++) {
                System.out.print(" ");
            }

            // 打印数字(前半)
            for (int k = count; k > 0; k--) {
                System.out.print(k + " ");
            }

            // 打印数字(后半)
            for (int l = 1; l <= count - 1; l++) {
                int temp = l + 1;
                System.out.print(temp + " ");
            }

            // 换行+次数记录
            System.out.println();
            count++;
        }
    }
}
