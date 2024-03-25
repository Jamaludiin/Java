public class Variables {
    public static void main(String[] args) {

        // int
        int var_int_1 = 123; // intialization
        int var_int_2;
        var_int_2 = 20; // late assignment

        System.out.println(var_int_1 + " " + var_int_2);
        System.out.println(10 + " " + 20);


        float var_float_1 = 33.98f; // ends with f otherwise it conflicts with double
        System.out.println(var_float_1 + " " + -20.98);

        double var_double_1 = 44.98d; // ends with d otherwise it conflicts with float
        System.out.println(var_double_1 + " " + -33.98);

        char var_char_1 = 'D';
        System.out.println(var_char_1 + " " + 'F');

        String var_str_1 = "This is Smart PC";
        System.out.println(var_str_1 + " " + 'F');

        // making the variables unchangable after initialization
        final int var_int;
        var_int = 22;
        System.out.println(var_int);
        //var_int = 33; // refuses
    
        // Declare Many Variables

        // traditional 
        int var_int1 = 45;
        int var_int2 = 678;
        int var_int3 = 77;
        System.out.println(var_int1 + var_int2 + var_int3); // add all

        // you can do in like this
        int var_int4 = 246, var_int5 = 421, var_int6 = 345; 
        System.out.println(var_int4 + " " + var_int5 + " " + var_int6); // seperated by space

        // assign One Value to Multiple Variables
        int var_int7, var_int8, var_int9; 
        var_int7 = var_int8 = var_int9 = 45;
        System.out.println(var_int7 + " " + var_int8 + " " + var_int9);


        // Identifiers name
        char varAge = 65;
        System.out.println(varAge);


        // my name printed 
        char myVar1 = 74, myVar2 = 65, myVar3 = 77, myVar4 = 65, myVar5 = 76;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);
        System.out.println(myVar4);
        System.out.println(myVar5);

        System.out.print(myVar1);
        System.out.print(myVar2);
        System.out.print(myVar3);
        System.out.print(myVar4);
        System.out.print(myVar5);
        
    }
}
