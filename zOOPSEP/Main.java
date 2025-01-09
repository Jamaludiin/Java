

import CarPac.Car2;


public class Main {
    public static void main(String[] args) {
       
        // Create a Vehicle object
        Car2 myCar = new Car2(); // reference to an object

        //Car2 myCar1 = new Car2(); // reference to an object


        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Color: " + myCar.getColor());


        myCar.setMake("BMW");
        myCar.setModel("X5");
        myCar.setYear(2022);

        System.out.println("\nMake: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Color: " + myCar.getColor());

    }
}
