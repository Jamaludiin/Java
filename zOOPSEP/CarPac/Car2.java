package CarPac;
public class Car2 {

    private String make;
    private String model;
    private int year;
    private String color = "RED";



    public Car2() {
        this.make = "Toyota";
        this.model = "Camry";
        this.year = 2022;
        this.color = "RED";
    }

    public Car2(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }


        public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    
    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }


} // end class Car2


