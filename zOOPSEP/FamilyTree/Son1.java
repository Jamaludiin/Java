package FamilyTree;

public class Son1 extends Father1 {
    // s_name
    String s_name;

    // CO NSTRUCTOR 
    public Son1(String g_name, String f_name, String s_name) {
        super(g_name, f_name);
        this.s_name = s_name;
    }
    

    // setter
    public void sets_name(String s_name) {
        this.s_name = s_name;
    }

    // getter

    public String gets_name() {
        return s_name;
    }


        // METHOD

        public void show3() {
            System.out.println("My First Name: " + s_name);
            System.out.println("Second Name is: " + getf_name());
            System.out.println("Family Name is: " + getg_name());
        }

}
