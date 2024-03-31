package Circle;

public class CircleDemo {
    public static void main(String[] args) {
        // Creating objects
        Circle circle1 = new Circle(); // Using default constructor
        Circle circle2 = new Circle(5.0); // Using constructor with specified radius

        // Accessing data and using methods
        // For circle1
        System.out.println("Circle 1 - Radius: " + circle1.radius);
        System.out.println("Circle 1 - Area: " + circle1.getArea());
        System.out.println("Circle 1 - Perimeter: " + circle1.getPerimeter());

        // For circle2
        System.out.println("Circle 2 - Radius: " + circle2.radius);
        System.out.println("Circle 2 - Area: " + circle2.getArea());
        System.out.println("Circle 2 - Perimeter: " + circle2.getPerimeter());
    }
}



class Circle {

    // Instance variable
    double radius;

    // Constructors
    public Circle() {
        this.radius = 1.0; // Default radius
    }

    public Circle(double newRadius) {
        this.radius = newRadius;
    }

    // Method to calculate and return the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate and return the perimeter (circumference) of the circle
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

}