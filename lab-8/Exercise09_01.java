
class Rectangle {
    // 成员变量
    double width = 1;
    double height = 1;

    /**constructor without args*/
    public Rectangle() {
    }

    /** constructor with args*/
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /** get rectangle area*/
    public double getArea() {
        double area = width * height;
        return area;
    }

    /**get rectangle perimeter*/
    public double getPerimeter() {
        double perimeter = 2 * (width + height);
        return perimeter;
    }
}

public class Exercise09_01 {
    public static void main(String[] args) {
        // rectangle 1
        Rectangle rect1 = new Rectangle(4.0,40.0);

        double area1 = rect1.getArea();
        System.out.println("The area of a rectangle with width " + rect1.width + " and height " + rect1.height + " is " + area1);

        double perimeter1 = rect1.getPerimeter();
        System.out.println("The perimeter of a rectangle is " + perimeter1);

        // rectangle 2
        Rectangle rect2 = new Rectangle(3.5,35.9);
    
        double area2 = rect2.getArea();
        System.out.println("The area of a rectangle with width " + rect2.width + " and height " + rect2.height + " is " + area2);

        double perimeter2 = rect2.getPerimeter();
        System.out.println("The perimeter of a rectangle is " + perimeter2);
    }
}