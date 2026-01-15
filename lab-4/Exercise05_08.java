
//需求：找出最大数
import java.util.Scanner;

public class Exercise05_08 {
    public static void main(String[] args) {
        // 1.人数录入
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int number = sc.nextInt();

        // 2.利用循环和初始化变量进行判断和对应
        double max = 0;
        double score = 0;
        String maxName = "";
        for (int i = 0; i <= number - 1; i++) {

            // 人名和成绩录入
            System.out.print("Enter a student name: ");
            String name = sc.next();
            System.out.print("Enter a student score: ");
            score = sc.nextDouble();

            // 向后传递max，并进行比较，记录较高值的人名
            max = max > score ? max : score;
            if (max == score) {
                maxName = name;
            }
        }
        System.out.println("Top student " + maxName + "'s score is " + max);

    }
}