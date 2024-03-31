package Circle;

public class Circle {

    // Instance variable
    private double radius;

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

    // Setter method to set the radius
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    // Getter method to get the radius
    public double getRadius() {
        return this.radius;
    }

    public static void main(String[] args) {
        // Create Circle objects and demonstrate methods
        Circle circle1 = new Circle(); // Default constructor
        Circle circle2 = new Circle(25.0); // Constructor with specified radius
        Circle circle3 = new Circle(125.0); // Constructor with specified radius
       
        // Output
        System.out.println("Circle 1 - Radius: " + circle1.getRadius());
        System.out.println("Circle 1 - Area: " + circle1.getArea());
        System.out.println("Circle 1 - Perimeter: " + circle1.getPerimeter());

        System.out.println("Circle 2 - Radius: " + circle2.getRadius());
        System.out.println("Circle 2 - Area: " + circle2.getArea());
        System.out.println("Circle 2 - Perimeter: " + circle2.getPerimeter());

        System.out.println("Circle 3 - Radius: " + circle3.getRadius());
        System.out.println("Circle 3 - Area: " + circle3.getArea());
        System.out.println("Circle 3 - Perimeter: " + circle3.getPerimeter());
    }
}


/*Circle

radius: double

Circle()
Circle(newRadius: double)
getArea(): double
getPerimeter(): double
setRadius(newRadius: double): void */