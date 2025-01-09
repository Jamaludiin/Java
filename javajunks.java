public class javajunks {
    
}



public class Main {
    public static void main(String[] args) {
        greet("Alice");  // Subprogram call
        System.out.println("Program continues...");
    }

    public static void greet(String name) {  // Subprogram definition
        System.out.println("Hello, " + name + "!");
    }
}


class PassByResult {
    static void update(int[] params) { // Mimics "out" mode
        params[0] = 10; // Pass result back to caller
        params[1] = 20;
    }

    public static void main(String[] args) {
        int[] values = {0, 0}; // Array mimics variables passed by reference
        update(values); 
        System.out.println("Values: " + values[0] + ", " + values[1]); // Output: Values: 10, 20
    }
}



