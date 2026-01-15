
//需求：复制数组，从from索引开始到to索引结束
import java.util.Scanner;

public class Exercise07_19 {
    public static void main(String[] args) {
        // 录入数据
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a list: ");
        int length = sc.nextInt();
        int[] list = new int[length];
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }

        // 调用
        boolean flag = isSorted(list);
        if (flag) {
            System.out.println("The list is already sorted");
        }else{
            System.out.println("The list is not sorted ");
        }

    }

    public static boolean isSorted(int[] list) {
        boolean flag = true;
        int max = list[0];
        for (int i = 1; i < list.length; i++) {
            max = max > list[i] ? max : list[i];
            if (max > list[i - 1]) {
                continue;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
