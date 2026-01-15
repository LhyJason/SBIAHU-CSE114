
//需求：找100-200间所有被4或5整除的数字但是不同时被这俩整除，并打印
public class Exercise05_11 {
    public static void main(String[] args) {
        for (int i = 101; i <= 200; i++) {
            // 判断整除的变量
            int d4 = i % 4;
            int d5 = i % 5;
            boolean result1 = d4 == 0 || d5 == 0;
            boolean result2 = d4 == 0 ^ d5 == 0;
            int count = 0;
            if (result1 == true && result2 == true) {
                count++;
                System.out.print(i + " ");
                if (count % 10 == 0) {
                    System.out.printf("\n");
                }
            }

        }
    }
}