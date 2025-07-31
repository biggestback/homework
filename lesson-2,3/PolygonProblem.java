// polygon -> triangle, pentagon, quadrilateral -> trapezoid, parallelogram -> rhombus, rectangle -> square

public class PolygonProblem {
    public static void main(String[] args) {
        Polygon poly = new Polygon(7);
        Triangle tri = new Triangle();
        Quadrilateral qua = new Quadrilateral();
        Parallelogram para = new Parallelogram();
        Rectangle rect = new Rectangle();
        Square sq = new Square();
        Rhombus rhom = new Rhombus();
        Trapezoid trap = new Trapezoid();
        Pentagon pent = new Pentagon();

        poly.displayType();
        tri.displayType();
        qua.displayType();
        para.displayType();
        rect.displayType();
        sq.displayType();
        rhom.displayType();
        trap.displayType();
        pent.displayType();

    }
}

class Polygon {
    protected int sides;

    public Polygon(int sides) {
        this.sides = sides;
    }

    public void displayType() {
        System.out.println("this is a polygon with " + sides + " sides");
    }
}

class Triangle extends Polygon {
    public Triangle() {
        super(3);
    }

    @Override
    public void displayType() {
        System.out.println("triangle");
    }
}

class Quadrilateral extends Polygon {
    public Quadrilateral() {
        super(4);
    }

    @Override
    public void displayType() {
        System.out.println("quadrilateral");
    }
}

class Parallelogram extends Quadrilateral {
    @Override
    public void displayType() {
        System.out.println("parallelogram");
    }
}

class Rectangle extends Parallelogram {
    @Override
    public void displayType() {
        System.out.println("rectangle");
    }
}

class Square extends Rectangle {
    @Override
    public void displayType() {
        System.out.println("square");
    }
}

class Rhombus extends Parallelogram {
    @Override
    public void displayType() {
        System.out.println("rhombus");
    }
}

class Trapezoid extends Quadrilateral {
    @Override
    public void displayType() {
        System.out.println("trapezoid");
    }
}

class Pentagon extends Polygon {
    public Pentagon() {
        super(5);
    }

    @Override
    public void displayType() {
        System.out.println("pentagon");
    }
}