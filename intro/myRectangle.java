public class myRectangle {

    // Instance variables
    double length = 5.0;
    double width = 3.0;

    // Method to calculate and return the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate and return the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        // Create a Rectangle object
        myRectangle rectangle = new myRectangle();

        // Calculate and print the area and perimeter of the rectangle
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());


        // you can also intialize the data fields in this way
        rectangle.length = 6.0;
        rectangle.width = 2.0;

        // Calculate and print the area and perimeter of the rectangle
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

    }
}
