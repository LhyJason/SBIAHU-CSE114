import java.util.StringJoiner;

class Fan {
    // 成员变量
    // 某个常量可以在一个类中的多个方法中使用
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "white";

    /** no args, define Fan */
    public Fan() {
    }

    // 成员方法
    /** get speed with in type */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /** give back speed with int type */
    public int getSpeed() {
        return speed;
    }

    /** get radius with double type */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** give back radius */
    public double getRadius() {
        return radius;
    }

    /** get on with boolean type */
    public void setOn(boolean on) {
        this.on = on;
    }

    /** give back on */
    public boolean getOn() {
        return on;
    }

    /** get color with String type */
    public void setColor(String color) {
        this.color = color;
    }

    /** give back color */
    public String getColor() {
        return color;
    }

    /** give the String back */
    public String toString() {
        StringJoiner sj = new StringJoiner(", ");
        String temp;
        if (on) {
            temp = "on";
        } else {
            temp = "off";
        }
        sj.add("speed " + speed).add("color " + color).add("radius " + radius).add("fan is " + temp);
        String s = sj.toString();
        return s;
    }
}

public class Exercise09_08 {
    public static void main(String[] args) {
        // Fan 1
        Fan f1 = new Fan();

        f1.setColor("yellow");
        // String color1 = f1.getColor();
        f1.setSpeed(Fan.FAST);
        // int speed1 = f1.getSpeed();
        f1.setRadius(10.0);
        // double radius1 = f1.getRadius();
        f1.setOn(true);
        // boolean on1 = f1.getOn();

        // using method
        String s1 = f1.toString();
        System.out.println(s1);

        // Fan 2
        Fan f2 = new Fan();

        f2.setColor("blue");
        // String color2 = f2.getColor();
        f2.setSpeed(Fan.MEDIUM);
        // int speed2 = f2.getSpeed();
        f2.setRadius(5.0);
        // double radius2 = f2.getRadius();
        f2.setOn(false);
        // boolean on2 = f2.getOn();

        // using method
        String s2 = f2.toString();
        System.out.println(s2);

    }

    // method
    /** make data to String */
    /*
     * public static void toString(String color, int speed, double radius, boolean
     * on) {
     * StringJoiner sj = new StringJoiner(", ");
     * String temp;
     * if(on){
     * temp = "on";
     * }else{
     * temp = "off";
     * }
     * sj.add("speed " + speed).add(color).add("radius " + radius).add("fan is " +
     * temp);
     * String s = sj.toString();
     * System.out.println(s);
     * }
     */
}
