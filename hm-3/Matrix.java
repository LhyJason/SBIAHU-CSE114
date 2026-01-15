import java.util.Scanner;
public class Matrix{
    public static void main(String[] args) {
        //data input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix1: ");
        double[][] matrix1 = createMatrix(sc);
        System.out.print("Enter matrix2: ");
        double[][] matrix2 = createMatrix(sc);

        //mutiply (method)
        double[][] result = multiplyMatrix(matrix1, matrix2);

        //output
        System.out.println("The multiplication of the matrices is");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                System.out.printf("%16f",result[i][j]);
            }
            System.out.println();
        }
    }

    /** to create matrix */
    public static double[][] createMatrix(Scanner sc) {
        double[][] matrix = new double[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }
        return matrix;
    }

    /**method that to multiply two matrices */
    public static double[][] multiplyMatrix(double [][] a,double[][] b){
        double[][] result = new double[3][3];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[i][j] = a[i][0]*b[0][j]+ a[i][1]*b[1][j]+a[i][2]*b[2][j];
            }
        }
        return result;
    }
}