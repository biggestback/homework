public class ShapeThing {
    
    //square
    public static double square(double side, boolean is3D) {
        if (is3D) {
            return side * side * side;
        } else {
            return side * side;
        }
    }

    // rectangle
    public static double rectangle(double length, double width, boolean is3D) {
        if (is3D) {
            return length * width * width;
        } else {
            return length * width;
        }
    }

    // equilateraltriangle
    public static double triangle(double base, double height, boolean is3D) {
        if (is3D) {
            return 0.5 * base * height * height;
        } else {
            return 0.5 * base * height;
        }
    }

    // circle
    public static double circle(double radius, boolean is3D) {
        if (is3D) {
            return (4.0 / 3.0) * Math.PI * radius * radius * radius;
        } else {
            return Math.PI * radius * radius;
        }
    }

    //angle thing
    public double otherAngle(int angle1, int angle2) {
        return Math.PI - (angle1 + angle2);
    }public static double otherAngle(double angle1, double angle2) {
        return Math.PI - angle1 - angle2;
    }
}
