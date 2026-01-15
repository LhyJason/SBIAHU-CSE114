
//需求：根据年份和月份首字母打印出该月天数，若月份输入不合理则进行提示
import java.util.Scanner;

public class Exercise04_17 {
    public static void main(String[] args) {
        // 1.数据录入并进行
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        System.out.print("Enter a month (first three letters with the first letter in uppercase): ");
        String s = sc.next();
        String month = "JanFebMarAprMayJunJulAugSepOctNovDec";

        // 2.月份简写合理性判断
        int number = month.indexOf(s);
        int temp = ((number + 3) / 3) - 1;
        if (number == -1) {
            System.out.println(s + " is not a correct month name");
        } else {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                String result = switchNumer2(temp);
                System.out.println(result);
            } else {
                String result = switchNumer1(temp);
                System.out.println(result);
            }

        }

    }

    // 定义方法前三问：
    // 1.我要干嘛？ --- 将字符串对应的数字转换为天数
    // 2.我干这件事情需要什么才能完成 --- 数组
    // 3.我干完了是否要把结果返回给调用处（需要继续使用，必须返回，反之亦然) ---返回对应数组中的一个元素
    // 0-31 1-2
    public static String switchNumer1(int number) {
        // 定义数组产生对应关系
        String[] arr = { "31", "28", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31" };
        // 返回结果
        return arr[number];
    }

    public static String switchNumer2(int number) {
        // 定义数组产生对应关系
        String[] arr = { "31", "29", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31" };
        // 返回结果
        return arr[number];
    }

}