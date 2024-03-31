public // Define a class named Circle
class Circle2 {
    // Instance variable to store the radius of the circle, initialized to 1.0 by default
    double radius = 1.0;

    // Constructor method to create a Circle object with default radius
    Circle2() {
    }

    // Constructor method to create a Circle object with a specified radius
    Circle2(double newRadius) {
        // Assign the specified radius to the instance variable
        radius = newRadius;
    }

    // Method to calculate and return the area of the circle
    double getArea() {
        // Calculate the area using the formula: π * radius^2
        return radius * radius * 3.14159;
    }


public static void main(String[] args) {
    // Create a Circle object with radius 1.0
    Circle2 circle1 = new Circle2(5.0);
    Circle2 circle2 = new Circle2();

    
    // Access and print the radius and area of circle1
    System.out.println("Circle 1 - Radius: " + circle1.radius);
    System.out.println("Circle 1 - Area: " + circle1.getArea());


    // Access and print the radius and area of circle1
    System.out.println("Circle 1 - Radius: " + circle2.radius);
    System.out.println("Circle 1 - Area: " + circle2.getArea());
}
}