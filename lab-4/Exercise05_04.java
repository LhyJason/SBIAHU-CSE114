//需求：打印英尺和厘米转换表
public class Exercise05_04 {
    public static void main(String[] args) {
        System.out.printf("%-16s%-16s\n", "Inches", "Centimetres");// "Inches\t Centimetres"
        for (int i = 1; i <= 10; i++) {
            double ci = i * 2.54;
            System.out.printf("%-16d%-16.2f\n", i, ci);// i + "\t" + ci
        }
    }
}