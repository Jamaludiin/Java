public class JavaTypeCasting {
    
    public static void main(String[] args) {

System.out.println("Widening Cast");

        // Widening Casting
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        byte varByte = 100;
        int varInt = varByte;
        System.out.println(varInt);

System.out.println("\n\nNarrowing Cast");
        // Narrowing Casting
        double myDouble1 = 9.78d;
        int myInt1 = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble1);   // Outputs 9.78
        System.out.println(myInt1);      // Outputs 9


        int varInt2 = 127;
        byte varByte1 = (byte) varInt2;
        System.out.println(varByte1);
    }
}



/*In Java, there are two types of casting:

Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte */