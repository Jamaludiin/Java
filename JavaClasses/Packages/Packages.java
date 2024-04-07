package Java.JavaClasses.Packages;
import java.util.Scanner;

public class Packages {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");
    
        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
      }
    
}


// A package in Java is used to group related classes. Think of it as a folder in a file directory. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:

    // Built-in Packages (packages from the Java API)
    //User-defined Packages (create your own packages)


//  importing packages
/*
    import package.name.Class;   // Import a single class
    import package.name.*;   // Import the whole package
 */

 // example 
 // import java.util.Scanner;


 // Import a Package
 /*
    There are many packages to choose from. In the previous example, we used the Scanner class from the java.util package. 
    This package also contains date and time facilities, random-number generator and other utility classes.
    
    To import a whole package, end the sentence with an asterisk sign (*). 
    The following example will import ALL the classes in the java.util package:
  */