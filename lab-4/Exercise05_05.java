//需求：打印英尺和厘米转换表
public class Exercise05_05 {
    public static void main(String[] args) {
        System.out.printf("%16s%16s%16s%16s%16s\n","Inches", "Centimetres", "|", "Centimetres", "Inches");//"Inches\t Centimeters\t|\tCentimeters\tInches"
        for (int i = 1; i <= 10; i++) {
            double c1i = i * 2.54;
            int c2i = i * 5;
            double inch2i = c2i / 2.54;
            System.out.printf("%16d%16.3f%16s%16d%16.3f\n",i, c1i, "|", c2i, inch2i);//i + "\t" + c1i + "\t|\t" + c2i + "\t" + inch2i
        }
    }
}