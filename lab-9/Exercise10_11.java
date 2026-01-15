class Circle2D {
    // 成员变量
    private double x;
    private double y;
    private double radius;

    /** no-args constructor for circle (0,0) and 1 */
    public Circle2D() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    /** A constructor that creates a circle with the specified x, y, and radius */
    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    /** the setter method of x */
    public void setX(double x) {
        this.x = x;
    }

    /** the setter method of y */
    public void setY(double y) {
        this.y = y;
    }

    /** the setter method of radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** the getter method of x */
    public double getX() {
        return x;
    }

    /** the getter method of y */
    public double getY() {
        return y;
    }

    /** the getter method of radius */
    public double getRadius() {
        return radius;
    }

    /** A method that returns the area of the circle */
    public double getArea() {
        double area = Math.pow(radius, 2) * Math.PI;
        return area;
    }

    /** A method that returns the perimeter of the circle */
    public double getPerimeter() {
        double perimeter = (2 * radius) * Math.PI;
        return perimeter;
    }

    /** calculate the distance between two center */
    private static double distance(double x1, double y1, double x2, double y2) {
        double temp = Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2);
        double distance = Math.pow(temp, 0.5);
        return distance;
    }

    /** A method that returns true if the specified point is inside this circle */
    public boolean contains(double x, double y) {
        if (distance(this.x, this.y, x, y) <= radius) {
            return true;
        } else {
            return false;
        }
    }

    /** A method that returns true if the specified circle is inside this circle */
    public boolean contains(Circle2D circle) {
        if (distance(this.x, this.y, circle.x, circle.y) <= this.radius -circle.radius ) {
            return true;
        } else {
            return false;
        }
    }

    /** A method that returns true if the specified circle overlaps this circle */
    public boolean overlaps(Circle2D circle) {

        if (Math.abs(circle.radius - radius) < distance(this.x, this.y, circle.x, circle.y)
                && distance(this.x, this.y, circle.x, circle.y) < circle.radius
                        + radius) {
            return true;
        } else {
            return false;
        }
    }
}
public class Exercise10_11{
    public static void main(String[] args) {

    Circle2D c1 = new Circle2D(2, 2, 5.5);
    System.out.println("Area is " + c1.getArea());
    System.out.println("Perimeter is " + c1.getPerimeter());
    System.out.println("c1 contains point (3, 3)? " 
      + c1.contains(3, 3));
    System.out.println("c1 contains circle Circle2D(4, 5, 10.5)? " 
      + c1.contains(new Circle2D(4, 5, 10.5)));
    System.out.println("c1 overlaps circle Circle2D(3, 5, 2.3)? " 
      + c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}