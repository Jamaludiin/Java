public class myCircle {
    
    // Instance variable
    double radius;

    // Constructor with radius parameter
    public myCircle(double radius) {
        this.radius = radius; // Initialize the radius attribute
    }

    // Method to calculate and return the area of the circle
    public double getArea() {
        return Math.PI * radius * radius; // Calculate area using formula πr^2
    }

    public static void main(String[] args) {
        // Create a Circle object with radius 1.0
        myCircle circle1 = new myCircle(1.0);
        
        // Access and print the radius and area of circle1
        System.out.println("Circle 1 - Radius: " + circle1.radius);
        System.out.println("Circle 1 - Area: " + circle1.getArea());
    }
}





