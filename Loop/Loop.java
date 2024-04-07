package Java.Loop;

public class Loop {
    public static void main(String[] args) {
        // Loops can execute a block of code as long as a specified condition is reached.
        /*
        while (condition) {
                    // code block to be executed
                }
        */
        
        int i = 0;
        while (i < 5) {
        System.out.println(i);

       // break;
        i++; // without increment it will be infinte loop, better you either break or 
        }


        System.out.println("");
        int j = 0;
        while (j < 5) {
            System.out.println(j);
            if (j == 3) {
                break;
            }
            j++;
            }
    
        }
    
}
