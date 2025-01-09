package Family;

public class Father extends Gfather {
    // give name to the class
    String f_name;
    // contructor
    public Father(String f_name, String g_name) {
        super(g_name);
        this.f_name = f_name;
    }
    
    // getter
    public String getF_name() {
        return f_name;
    }
    // setter
    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    // method
    @Override
    public void display() {
        System.out.println("Father name is " +  f_name + getF_name() + getG_name());
    }


    public void overload(String myname){

        System.out.println("Gfather name is "   + g_name + myname);
    }

}
