package Family;

public class Son extends Father {
        // give name to the class
        String s_name;

        // contructor
        public Son(String s_name, String f_name,    String g_name) {
            super(f_name, g_name);
            this.s_name = s_name;
        }

        // getter
        public
            String getS_name() {
            return s_name;
        }

        // setter
        public void setS_name(String s_name) {
            this.s_name = s_name;
        }
        // method
        @Override
        public void display()
        {
            System.out.println("Son name is "   + s_name);
        }


        public void overload(String myname, int myage){

            System.out.println("son overload info is "   + g_name + myname + myage);
        }

}
