public class ShapeThing {
    

    //square

    public static double area(double side, boolean is3D) {
        if (is3D) {
            return side * side * side;
        } else {
            return side * side;
        }
    }


    // rectangle

    public static double area(double length, double width, boolean is3D) {
        if (is3D) {
            return length * width * width;
        } else {
            return (length * width) / 2;
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

    public static double otherAngle(int angle1, int angle2) {
        return 180 - (angle1 + angle2);
    }public static double otherAngle(double angle1, double angle2) {
        return Math.PI - angle1 - angle2;
    }

    public static void main(String[] args) {
        System.out.println("square area: " + area(5, false));
        System.out.println("cube volume: " + area(5, true));
        System.out.println("rectangle area: " + area(5, 4, false));
        System.out.println("rectangular prism volume: " + area(5, 4, true));
        System.out.println("triangle area: " + area(5, 4, false));
        System.out.println("triangular prism volume: " + area(6, 4, true));
        System.out.println("circle area: " + area(7, false));
        System.out.println("sphere volume: " + area(7, true));

        System.out.println("triangle other angle (degrees): " + otherAngle(50, 60));
        System.out.println("triangle other angle (radians): " + otherAngle(Math.PI / 3, Math.PI / 4));
    }
}
