public class Exercise06_13 {
    public static void main(String[] args) {
        System.out.printf("%8s\t%8s\n", "i", "m(i)");
        for (int i = 1; i <= 20; i++) {
            double result1 = m(i);
            System.out.printf("%8d\t%8.4f\n", i, result1);

        }
    }

    // 方法
    public static double m(int i) {
        double result = 0;
        for (int j = 1; j <= i; j++) {
            result += j / (j + 1.0);//先运算在赋值，如果用1则没有进行隐式转换，因此用1.0先转换为double类型
        }
        return result;
    }
}