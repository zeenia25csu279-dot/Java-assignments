
abstract class Shape {

    private String color;

    Shape(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }

    abstract double area();

    abstract double perimeter();

    @Override
    public String toString() {
        return "Color: " + color;
    }
}


class Circle extends Shape {

    private double radius;

    Circle(String color, double radius) {
        super(color);

        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }

        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle - " + super.toString()
                + ", Radius: " + radius
                + ", Area: " + area()
                + ", Perimeter: " + perimeter();
    }
}


class Rectangle extends Shape {

    private double length;
    private double width;

    Rectangle(String color, double length, double width) {
        super(color);

        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be positive");
        }

        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle - " + super.toString()
                + ", Length: " + length
                + ", Width: " + width
                + ", Area: " + area()
                + ", Perimeter: " + perimeter();
    }
}


class Square extends Shape {

    private double side;

    Square(String color, double side) {
        super(color);

        if (side <= 0) {
            throw new IllegalArgumentException("Side must be positive");
        }

        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }

    @Override
    double perimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square - " + super.toString()
                + ", Side: " + side
                + ", Area: " + area()
                + ", Perimeter: " + perimeter();
    }
}


public class ShapeManagementApp {

    // Compile-time polymorphism using method overloading
    static void display(String message) {
        System.out.println(message);
    }

    static void display(String message, double value) {
        System.out.println(message + value);
    }


    public static void main(String[] args) {

        // Shape array containing mixed objects
        Shape[] shapes = {
            new Circle("Red", 5),
            new Rectangle("Blue", 4, 6),
            new Square("Green", 5),
            new Circle("Yellow", 3),
            new Rectangle("Black", 7, 2)
        };


        display("SHAPE MANAGEMENT APPLICATION");
        display("----------------------------");


        // Display every shape
        display("All Shapes:");

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
        }


        // Calculate total area
        double totalArea = 0;

        for (int i = 0; i < shapes.length; i++) {
            totalArea = totalArea + shapes[i].area();
        }

        display("Total Area: ", totalArea);


        // Feature 1: Calculate average area
        double averageArea = totalArea / shapes.length;

        display("Average Area: ", averageArea);


        // Feature 2: Find shape with largest area
        Shape largestShape = shapes[0];

        for (int i = 1; i < shapes.length; i++) {

            if (shapes[i].area() > largestShape.area()) {
                largestShape = shapes[i];
            }
        }


        System.out.println("Largest Shape:");
        System.out.println(largestShape);
    }
}
