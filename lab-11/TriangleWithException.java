public class TriangleWithException {
    /** Declare an exception TriangleWithException */
    TriangleWithException(double a, double b, double c) throws IllegalTriangleException {
        String msg = "The sum of any two sides should be greater than the other side";
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException(a, b, c, msg);
        }
    }

    /** display void main */
    public static void main(String[] args) {

        try {
            TriangleWithException t = new TriangleWithException(1, 2, 3);
        } catch (IllegalTriangleException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}

class IllegalTriangleException extends Exception {
    private double side1;
    private double side2;
    private double side3;
    private String str;

    /** create a construction IllegalTriangleException */
    public IllegalTriangleException(double side1, double side2, double side3, String str) {
        super(str);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.str = str;
    }
}
