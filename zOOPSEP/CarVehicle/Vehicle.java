package CarVehicle;

// BASE CLASS 
public class Vehicle {
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
    public void displayInfo2() {
        System.out.println("Vehicle Information:");
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
    }
}