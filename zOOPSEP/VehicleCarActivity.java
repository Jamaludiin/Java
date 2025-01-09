// Vehicle class
 

class Vehicle {
    private String make;
    private String model;

    // Constructor
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Getter for make
    public String getMake() {
        return make;
    }

    // Setter for make
    public void setMake(String make) {
        this.make = make;
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Setter for model
    public void setModel(String model) {
        this.model = model;
    }

    // Display info method
    public void displayInfo() {
        System.out.println("Vehicle Information:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
    }
}

// Car class (independent from Vehicle)
 class Car {
    private int year;
    private String color;

    // Constructor
    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Setter for year
    public void setYear(int year) {
        this.year = year;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Display info method
    public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }
}

// Main class to test the Vehicle and Car classes
 public class VehicleCarActivity {
    public static void main(String[] args) {
        // Create a Vehicle object
        Vehicle vehicle = new Vehicle("Toyota", "Camry");
        vehicle.displayInfo();

        System.out.println(); // Add a blank line for readability

        // Create a Car object
        Car car = new Car(2023, "Blue");
        car.displayInfo();
    }
}

