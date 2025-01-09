package CarVehicle;

public class MotorCycle extends Vehicle {   
    private int year;
    private String color;

        // Constructor  

        public MotorCycle(int year, String color, String make, String model) {
            // Call the constructor of the base class first
            super(make, model);

            this.year = year;
            this.color = color; 
            //this.setMake(make);
        }

        // Getter for year
        public int getYear() {
            return year;
        }
        // Setter for year

        public void setYear(int year) {
            this.year = year;
        }   
        // Getter for color

        public String getColor() {
            return color;
        }   

        // Setter for color

        public void setColor(String color) {
            this.color = color;
        }

        // Display info method  
        public void displayInfo() {
            System.out.println("MotorCycle Information:");
            System.out.println("Year: " + getYear());
            System.out.println("Color: " + getColor());
            System.out.println("Make: " + getMake());
            System.out.println("Model: " + getModel());
        }
    }




