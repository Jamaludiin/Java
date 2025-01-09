package FamilyTree;

public class GrFather {
    // g_name
    String g_name;


    //CONSTRUCTOR
    public GrFather(String g_name) {
        this.g_name = g_name;
    }


    //SETTERS
    public void setg_name(String g_name) {
        this.g_name = g_name;
    }

    // GETTERS
    public String getg_name() {
        return g_name;
    }

    //METHOD    
    public void show1() {
        System.out.println("Grand Father Name is: " + g_name);
    }
}
