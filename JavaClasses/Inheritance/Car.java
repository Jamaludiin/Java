package Java.JavaClasses.Inheritance;



// Inheritance (Subclass and Superclass)
/*
    subclass (child) - the class that inherits from another class
    superclass (parent) - the class being inherited from
 */

 // To inherit from a class, use the extends keyword.

// parent class or superclass
 class Vehicle {
    protected String brand = "Ford";        // Vehicle attribute

    public void honk() {                    // Vehicle method
      System.out.println("Tuut, tuut!");
    }
  }
  

  // subclass (child)
  class Car extends Vehicle {
    private String modelName = "Mustang";    // Car attribute
    public static void main(String[] args) {
  
      // Create a myCar object
      Car myCar = new Car();
  
      // Call the honk() method (from the Vehicle class) on the myCar object
      myCar.honk();
  
      // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
      System.out.println(myCar.brand + " " + myCar.modelName);
    }
  }