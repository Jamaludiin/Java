package Java;
import java.util.Scanner; // Import Scanner class
import java.util.Date; // Import Date class

public class PrimitivevsObjectVar {
    
    // Primitive Data Types
    int x = 10; // Primitive variable storing an integer value
    double y = 3.14; // Primitive variable storing a floating-point value
    boolean flag = true; // Primitive variable storing a boolean value

    // Object Types
    String str = "Hello"; // Object variable referring to a String object
    Scanner scanner = new Scanner(System.in); // Object variable referring to a Scanner object

    // Initializing an object
    Date today = new Date(); // Creating a Date object and assigning its reference to today

    // Main method to execute the code
    public static void main(String[] args) {
        // Create an instance of the PrimitivevsObjectVar class
        PrimitivevsObjectVar obj = new PrimitivevsObjectVar();
        
        // Print the values of primitive variables
        System.out.println("x: " + obj.x);
        System.out.println("y: " + obj.y);
        System.out.println("flag: " + obj.flag);

        // Print the value of object variables
        System.out.println("str: " + obj.str);
        System.out.println("today: " + obj.today);

        // Close the scanner
        obj.scanner.close();
    }
}
