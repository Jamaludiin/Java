package FamilyTree;

public class MainFamily {
    //main method
    public static void main(String[] args) {
Son1 son = new Son1("Ali", "Mohamed", "John");
son.show3();

GrFather gfather = new GrFather("Nur");

Father1 father1 = new Father1(gfather.getg_name(), "Ali");

Son1 son2 = new Son1(gfather.getg_name(), father1.getf_name(), "Kiev");

System.out.println("\n");
son2.show3();
son2.show2();
son2.show1();


System.out.println("\n");

father1.show1(); // his father, ffather
father1.show2();// father/his own show



System.out.println("\n");
gfather.show1();

}

}