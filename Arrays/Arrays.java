package Java.Arrays;

public class Arrays {
    public static void main(String[] args) {
        // Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
        
        
        // To declare an array, define the variable type with square brackets:
        char[] cars;
        // To insert values to it, you can place the values in a comma-separated list, inside curly braces:
        // cars = {'C','h', 'K'};  // you cannot do this
        //DO THIS ISNTEAD

        // To declare an array, define the variable type with square brackets:
        char[] chars;
        // To insert values to it, you can place the values in a comma-separated list, inside curly braces:
        chars = new char[] {'C', 'h', 'K'};
        System.out.println(chars);


        System.out.println("");


        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars2);


        System.out.println("");


        // create an array of integers, you could write:
        int[] myNum = {10, 20, 30, 40};
        System.out.println(myNum);


        // the above access is not good
        // when you print an array directly using System.out.println(), you will not see the contents of the array, 
        // but rather a reference to the array object.

        /*Access the Elements of an Array
        You can access an array element by referring to the index number. */

        System.out.println(cars2[1]);
        System.out.println(myNum[1]);
        System.out.println(chars[1]);


        System.out.println("");


        // Change an Array Element
        cars2[1] = "MyV";
        myNum[1] = 22;
        chars[1] = 'U';


        System.out.println(cars2[1]);
        System.out.println(myNum[1]);
        System.out.println(chars[1]);



        System.out.println("");

        // Array Length
        // To find out how many elements an array has, use the length property:
        System.out.println(chars.length);


    }
    
}
