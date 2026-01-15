import java.util.Scanner;

class GeometricObject {
    private String color = "white";

    // /** Construct a default geometric object */
    // GeometricObject() {
    // }

    // /** Construct a geometric object with the specified color */
    // public GeometricObject(String color) {
    //     this.color = color;
    // }

    /** Return color */
    public String getColor() {
        return color;
    }

    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }
} 

class Triangle2D extends GeometricObject {
    // members
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    /** constructor with no-args */
    public Triangle2D() {

    }

    /** constructor with args */
    public Triangle2D(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /** method of getting side1 */
    public double getSide1() {
        return side1;
    }

    /** method of setting side1 */
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    /** method of getting side2 */
    public double getSide2() {
        return side2;
    }

    /** method of setting side2 */
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    /** method of getting side3 */
    public double getSide3() {
        return side3;
    }

    /** method of setting side3 */
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    /** method returns the perimeter of this triangle */
    public double getPerimeter() {
        double p = side1 + side2 + side3;
        return p;
    }

    /** method returns the area of this triangle */
    public double getArea() {
        double p = getPerimeter() / 2;
        double temp = p * (p - side1) * (p - side2) * (p - side3);
        double area = Math.pow(temp, 0.5);
        return area;
    }

    /** method returns a string description for the triangle */
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}


// test program
public class Exercise11_01 {
    public static void main(String[] args) {
        // origin data
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides: ");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        // new Triangle
        Triangle2D t = new Triangle2D(side1, side2, side3);

        // //color
        // System.out.print("Enter the color: ");
        // String color = sc.next();
        // t.setColor(color);

        // area
        double area = t.getArea();
        System.out.println("The area is " + area);

        // perimeter
        double perimeter = t.getPerimeter();
        System.out.println("The perimeter is " + perimeter);

        // description
        String s = t.toString();
        System.out.println(s);

    }
}