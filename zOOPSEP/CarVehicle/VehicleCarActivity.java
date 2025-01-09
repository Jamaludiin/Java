// Main class to test the Vehicle and Car classes
package CarVehicle;

 public class VehicleCarActivity {
    public static void main(String[] args) {
       // IN HERE

        // Create a Vehicle object
        //Vehicle vehicle = new Vehicle();
        //vehicle.displayInfo();

        System.out.println(); // Add a blank line for readability


        // Create a Car object
        Car car = new Car(2010, "Blue", "Toyota", "Camry");
    
        car.setMake("BMW");
        car.setModel("X10");
        System.out.println(); // Add a blank line for readability

        car.displayInfo();


        System.out.println("==============================\n"); // Add a blank line for readability
        
        MotorCycle motorCycle = new MotorCycle(2010, "Red", "BMW", "motoX12");
        motorCycle.displayInfo();

        System.out.println("==============================\n");

        motorCycle.setYear(2020);
        motorCycle.setColor("Black");
        motorCycle.setMake("BMW");
        motorCycle.setModel("motoX12");
        System.out.println(); // Add a blank line for readability
        motorCycle.displayInfo();

    }
}

