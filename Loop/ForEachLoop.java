package Java.Loop;

public class ForEachLoop {
    public static void main(String[] args) {
       
        /*
         *for (type variableName : arrayName) {
        // code block to be executed
        }
         */

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
        System.out.println(i);
        }


        
    }

}

//There is also a "for-each" loop, which is used exclusively to loop through elements in an array: