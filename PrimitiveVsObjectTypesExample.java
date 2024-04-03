package Java;

public class PrimitiveVsObjectTypesExample {
    

    public static void main(String[] args) {

        // Primitive Data Types
        int intValue = 5;
        double doubleValue = 3.14;
        boolean boolValue = true;
        char charValue = 'A';

        // Object Types
        Circle circle = new Circle(5.0); // Object of the Circle class
        Circle circle2 = new Circle(34.0); // Object of the Circle class

        String str = "Hello"; // Object of the String class

        // Displaying values
        System.out.println("Primitive Data Types:");
        System.out.println("int value: " + intValue);
        System.out.println("double value: " + doubleValue);
        System.out.println("boolean value: " + boolValue);
        System.out.println("char value: " + charValue);

        System.out.println("\nObject Types:");
        System.out.println("Circle radius: " + circle.getArea());
        System.out.println("String value: " + str);

        System.out.println("circle value: " + circle.radius);
        System.out.println("circle2 value: " + circle2.radius);

        //
        circle = circle2;
        System.out.println("circle value: " + circle.radius);
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