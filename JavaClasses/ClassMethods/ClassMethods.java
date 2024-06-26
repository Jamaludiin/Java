package Java.JavaClasses.ClassMethods;

public class ClassMethods {


    // static method
    static void myMethod() {
        System.out.println("Hello World from class called ClassMethods");
      }


      // Instance method
    public void printX() {
        System.out.println("This is Instance method ");
    }


    public static void main(String[] args) {

        // static method access
        myMethod(); // legal
        ClassMethods.myMethod(); // legal

        // instance method access
        // illegal and error
       /*printX();
        ClassMethods.printX();*/ 
        // use this
        ClassMethods instanceMethod = new ClassMethods();
        instanceMethod.printX();


        System.out.println();


        // static method
        CM1 myObj = new CM1();
        myObj.myMethod();// not good

        /*When you access a static method through an instance (object) of the class, 
        Java allows it, but it's generally considered bad practice because it can confuse readers into 
        thinking the method is an instance method. 

        The method is called on a specific instance of the class, but internally, 
        Java resolves it using the class name rather than the instance.
        */
        CM1.myMethod(); // Accessing a static method directly through the class name is the recommended 

        // public status
       myObj.myMethod1();
       // CM1.myMethod1(); // cannot access 

       // public static
       CM1.myMethod2(); // same like static method

       // private cannot access in this way
       /*myMethod3();
       myObj.myMethod3();
       CM1.myMethod3();*/

    
    }
    
}



class CM1{

    static void myMethod() {
        System.out.println("Hello World from class called CM1");
      }

      public void myMethod1() {
        System.out.println("Hello World from public method class called CM1");
      }


      public static void myMethod2() {
        System.out.println("Hello World from public static method class called CM1");
      }

      private static void myMethod3() {
        System.out.println("Hello World from private static method class called CM1");
      }
}