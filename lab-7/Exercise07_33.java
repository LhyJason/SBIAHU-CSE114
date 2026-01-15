
//需求：判断该年份是什么生肖
import java.util.Scanner;

public class Exercise07_33 {
    public static void main(String[] args) {
        // 数据录入
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int nian = sc.nextInt();
        String[] shengxiao = { "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep", "monkey", "rooster",
                "dog", "pig" };

        // 判断
        int temp = (nian - 1900) % 12;
        if (nian >= 1900) {
            System.out.println(shengxiao[temp]);
        } else {
            int temp1 = 12 - Math.abs(temp);
            System.out.println(shengxiao[temp1]);
        }

    }
}