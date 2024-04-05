package Java.Variables;
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");

    System.out.print("Hello World using the print\n");

    System.out.println(76);
    System.out.println(3 + 3);

    
    Meth b = new Meth(); // Corrected instantiation of the Meth class
    System.out.println(b.a); // Print the value of 'a' from the Meth instance 'b'
  
  }

  public static class Meth { // Changed to static class for proper nesting
    int a = 10;
  }
}


// Every line of code that runs in Java must be inside a class
// A class should always start with an uppercase first letter.
// Java is case-sensitive: "MyClass" and "myclass" has different meaning. Main and main is diffrent
// The name of the java file must match the class name.
// you must save the java file using the class name and add ".java"


// The main() method is required and you will see it in every Java program:
/* the main() method serves as the entry point for any Java program. When you run a Java program, 
the Java Virtual Machine (JVM) starts executing the program by invoking the main() method. */
// It tells the JVM where to begin executing the program.
// It must be declared as public, so it can be accessed by the JVM.
// It must be declared as static, meaning it belongs to the class itself rather than to any specific instance of the class.
// It must return void, indicating that it doesn't return any value.
// It must accept a single argument of type String array (String[] args), which allows command-line arguments to be passed to the program.