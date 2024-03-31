public class Rectangle {

    // Instance variables
    double length;
    double width;

    // Constructor with length and width parameters
    public Rectangle(double length, double width) {
        this.length = length; // Initialize length
        this.width = width;   // Initialize width
    }

    // Method to calculate and return the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate and return the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        // Create a Rectangle object with length 5.0 and width 3.0
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        // Calculate and print the area and perimeter of the rectangle
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
    }
}
