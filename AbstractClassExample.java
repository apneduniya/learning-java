abstract class Shape {
    double dim1, dim2;

    Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract double area();
}

class Rectangle extends Shape {
    Rectangle(double length, double width) {
        super(length, width);
    }

    double area() {
        return dim1 * dim2;
    }
}

class Triangle extends Shape {
    Triangle(double base, double height) {
        super(base, height);
    }

    double area() {
        return 0.5 * dim1 * dim2;
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle(10, 5);
        Shape shape2 = new Triangle(10, 5);
        System.out.println("Area of rectangle: " + shape1.area());
        System.out.println("Area of triangle: " + shape2.area());
    }
}