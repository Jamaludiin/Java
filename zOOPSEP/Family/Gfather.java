package Family;

public class Gfather {
   // give name to the class
    String g_name;
    
    // contructor
    public Gfather(String g_name) {
        this.g_name = g_name;
    }

    // getter
    public String getG_name() {
        return g_name;
    }

    // setter
    public void setG_name(String g_name) {
        this.g_name = g_name;
    }
    // method
    public void display() {
        System.out.println("Gfather name is "   + g_name);
}

public void overload(){

    System.out.println("Gfather name is "   + g_name);
}

}