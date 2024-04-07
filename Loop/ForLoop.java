package Java.Loop;

public class ForLoop {
    public static void main(String[] args) {
        
        /*
        for (statement 1; statement 2; statement 3) {
            // code block to be executed
        }


        Statement 1 is executed (one time) before the execution of the code block.
        Statement 2 defines the condition for executing the code block.
        Statement 3 is executed (every time) after the code block has been executed.
         */


        int k = 0;
        for (;k<5;k++){
            System.out.println(k);
        }

        System.out.println("");

        // another one
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
          }

        System.out.println("");

        // another one
          for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
          }

        System.out.println("");

          // Nested Loops
          // Outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times
            
            // Inner loop
            for (int j = 1; j <= 3; j++) {
            System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        } 



        
    }
    
}


// When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop: