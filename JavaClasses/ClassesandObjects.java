package Java.JavaClasses;

public class ClassesandObjects {
    
    int x = 50;





    public static void main(String[] args) {

        // this the class called ClassesandObjects is the one in the class name with public
        ClassesandObjects myObj = new  ClassesandObjects();
        System.out.println(myObj.x);



        // the second class outside without public
        // Create an object called "myObj" and print the value of x:
        C1 myObj1 = new  C1();
        System.out.println(myObj1.x);


        System.out.println();

       // Multiple Objects:    You can create multiple objects of one class:
        C1 myObj2 = new C1();  // Object 2
        C1 myObj3 = new C1();  // Object 3
        System.out.println(myObj2.x);
        System.out.println(myObj3.x);



        /*
         *  Using Multiple Classes
            You can also create an object of a class and access it in another class. 
            This is often used for better organization of classes (one class has all the attributes and methods,
            while the other class holds the main() method (code to be executed)).

            Remember that the name of the java file should match the class name. 
            In this example, we have created two files in the same directory/folder:

            ClassesandObjects.java
            C1 inside the ClassesandObjects
            C2.java
         */


         // ACCESS EXTERNAL CLASS
         C2 myObj4 = new C2();  // Object 2
         System.out.println(myObj4.x);
    }







}


// To create a class, use the keyword class:

 class C1 {
    int x = 5;
  }