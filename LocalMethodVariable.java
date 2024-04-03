package Java;

public class LocalMethodVariable {
    
        public static void main(String[] args) {
            exampleMethod();
        }
    
        public static void exampleMethod() {
            int localVar;
            // Attempting to use localVar before initializing it will result in a compilation error
            // System.out.println("Value of localVar: " + localVar);
    
            // Initialize localVar
            localVar = 10;
    
            // Now localVar can be used
            System.out.println("Value of localVar: " + localVar);
        }
    }

