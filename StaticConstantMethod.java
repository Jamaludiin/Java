package Java;

public class StaticConstantMethod {
    
    public static void main(String[] args) {
        Circles circle = new Circles(16);
        System.out.println(circle.radius);
        circle.calculateArea();
        Circles.getNumberOfCircles();
    }
}

class Circles {
    // Static variable
    static int numberOfCircles = 10; // Shared by all instances, counts the number of circles
    
    // Instance variables
    double radius; // Represents the radius of the circle
    
    // Constructor
    public Circles(double radius) {
        this.radius = radius;
        numberOfCircles++; // Incrementing the count of circles upon creation of each instance
    }
    
    // Static method to get the total number of circles created
    public static int getNumberOfCircles() {
        return numberOfCircles;
    }
    
    // Instance method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    // Static constant
    static final double PI = Math.PI; // Shared by all instances, represents the value of pi
}
