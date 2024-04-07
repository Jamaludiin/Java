package Java.JavaClasses.Constructors;


public class Constructors {
    
    int x;  // Create a class attribute

    int modelYear;
    String modelName;

  // Create a class constructor for the Constructors class
  public Constructors() {
    x = 5;  // Set the initial value for the class attribute x
  }


  // Constructor Parameters
  public Constructors(int y) {
    x = y;
  }

  // Constructor with many parameters 
  public Constructors(int year, String name) {
    modelYear = year;
    modelName = name;
  }


  public static void main(String[] args) {
    
    Constructors myObj = new Constructors(); // Create an object of class Constructors (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x


    // Constructor Parameters
    Constructors myObj1 = new Constructors(55);
    System.out.println(myObj1.x);


    // Constructor with many parameters 
    Constructors myCar = new Constructors(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);


  }


}


// A constructor in Java is a special method that is used to initialize objects. 
// The constructor is called when an object of a class is created. 
// It can be used to set initial values for object attributes: