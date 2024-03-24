

public class Methods {
    
    // variable declaration 
    static int count = 0; // Static variable
    // int a = 10; unless you declare as static
    int b = 20;





    // system entry point
    public static void main(String[] args) {
    // display them
    System.out.println(count);

    int a = 10;
    System.out.println(a);

    Methods obj = new Methods(); // to access the b in the class Method you need to declare obj to allow u such access
    System.out.println(obj.b);
    System.out.println(obj.count);// legal but this is dynamic way as objects is created during the runtime
    obj.count = 35;
    System.out.println(obj.count);// legal but this is dynamic way as objects is created during the runtime



    // call outsid method
    display();

    }


    // Method declaration
    static void display() { // Static method
        System.out.println("Hello, world!");
        int c = 30;
        System.out.println(c);

    }
}
