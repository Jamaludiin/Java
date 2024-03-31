public class circle {

    /*The issue is that the Circle class is defined inside another class circle. 
    In Java, nested classes cannot be accessed directly from the outer class's static context (such as the main method). 
    To fix this issue, you can either move the Circle class outside the circle class or make it a static nested class. */
    
    
    static class Circle {
    /** The radius of this circle */
    double radius = 1.0;

    /** Return the area of this circle */
    double getArea() {
        return radius * radius * 3.14159;
    }
}

public static void main(String[] args) {

    // Create a Circle object with default radius
    Circle circle = new Circle();
        
    // Access and print the radius and area of circle1
    System.out.println("Circle 1 - Radius: " + circle.radius);
    System.out.println("Circle 1 - Area: " + circle.getArea());

}

}


