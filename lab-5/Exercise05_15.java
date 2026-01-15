
//需求：打印ASCII表，33-126位

public class Exercise05_15 {
    public static void main(String[] args) {

        int i = 0;
        int count = 0;

        for (i = 33; i <= 126; i++) {
            System.out.printf("%3c", i);
            count++;
            if (count % 10 == 0) {
                System.out.println("\n");
            }

        }

        System.out.println("\n");

    }

}
