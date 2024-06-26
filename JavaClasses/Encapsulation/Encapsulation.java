package Java.JavaClasses.Encapsulation;

public class Encapsulation {


  public static void main(String[] args) {
    

    Person myObj = new Person();
    // myObj.name = "John";  // error
   // System.out.println(myObj.name); // error


   // use this instead
   myObj.setName("John"); // Set the value of the name variable to "John"
   System.out.println(myObj.getName());
  }
    
}


/*Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:

declare class variables/attributes as private
provide public get and set methods to access and update the value of a private variable
 */

/*Why Encapsulation?
    Better control of class attributes and methods
    Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
    Flexible: the programmer can change one part of the code without affecting other parts
    Increased security of data
 */

  class Person {
    private String name; // private = restricted access
  
    // Getter
    public String getName() {
      return name;
    }
  
    // Setter
    public void setName(String newName) {
      this.name = newName;
    }
  }