// Base class (superclass)
class TransportSystem {
    public void move() {
        System.out.println("Transport System!");
    }
}

// Car class
class Car extends TransportSystem {
    @Override
    public void move() {
        System.out.println("Drive!");
    }
}

// Boat class
class Boat extends TransportSystem {
    @Override
    public void move() {
        System.out.println("Sail!");
    }
}

// Plane class
class Plane extends TransportSystem {
    @Override
    public void move() {
        System.out.println("Fly!");
    }
}

// Main class
public class MainV {
    public static void main(String[] args) {
        // Create objects of different classes
        TransportSystem car = new Car();
        TransportSystem boat = new Boat();
        TransportSystem plane = new Plane();

        // Array of TransportSystem type
        TransportSystem[] vehicles = {car, boat, plane};

        // Polymorphism in action
        for (TransportSystem vehicle : vehicles) {
            vehicle.move();  // Calls the overridden method
        }
    }
}
