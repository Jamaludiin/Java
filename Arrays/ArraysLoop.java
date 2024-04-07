package Java.Arrays;

public class ArraysLoop {
    public static void main(String[] args) {


        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
          System.out.println(cars[i]);

        }     

        System.out.println();
        System.out.println(cars.length);
        


        System.out.println();

        // Loop Through an Array with For-Each
        String[] cars1 = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars1) {
          System.out.println(i);


        }
    }
    
}
