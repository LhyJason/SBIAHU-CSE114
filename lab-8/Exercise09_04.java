import java.util.Random;

public class Exercise09_04 {
    public static void main(String[] args) {
        Random r = new Random(1000);
        for (int i = 0; i < 50; i++) {
            int number = r.nextInt(100);
            System.out.print(number + " ");
        }
    }
}