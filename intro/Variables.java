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
    }
}
