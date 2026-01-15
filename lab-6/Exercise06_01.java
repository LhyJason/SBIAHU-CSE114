public class Exercise06_01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int result = getPentagonalNumber(i);
            System.out.printf("%7d", result); 
        }
    }

    // 方法
    public static int getPentagonalNumber(int n) {
        int result = n * (3 * n - 1) / 2;
        return result;
    }
    
}
