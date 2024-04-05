package Java.GarbageCollection;

public class GarbageCollection {


    public static void main(String[] args) {


        // Object Types
        Circle circle1 = new Circle(5.0); // Object of the Circle class
        Circle circle2 = new Circle(34.0); // Object of the Circle class

        // Displaying values
        // Before the Garbage Collection

        System.out.println("circle1 value: " + circle1.radius);
        System.out.println("circle2 value: " + circle2.radius);

        // Garbage Collection
        circle1 = circle2;
        System.out.println("circle1 value: " + circle1.radius);
        System.out.println("circle2 value: " + circle2.radius);

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