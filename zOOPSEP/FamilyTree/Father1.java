package FamilyTree;

public class Father1 extends GrFather {
    // f_name
    String f_name;


        //CONSTRUCTOR
        public Father1(String g_name, String f_name) {
            super(g_name);
            this.f_name = f_name;
        }


    // GETTERS
    public String getf_name() {
        return f_name;
    }

    // SETTERS

    public void setf_name(String f_name) {
        this.f_name = f_name;
    }

    // METHOD
    public void show2() {
        System.out.println("Father Name is: " + f_name);
        System.out.println("My Gr Father Name is: " + getg_name());

    }

    
}
