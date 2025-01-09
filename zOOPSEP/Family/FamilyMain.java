package Family;

import FamilyTree.Son1;

public class FamilyMain {
    public static void main(String[] args) {
       
 // Create a Gfather object
        Gfather gfather = new Gfather("Gfather");
        gfather.display();

        System.out.println(); // Add a blank line for readability
        // Create a Father object
        Father father = new Father("Father", "Gfather");
        father.display();

        System.out.println(); // Add a blank line for readability

        // Create a Son object
        Son son = new Son("Son", "Father", "Gfather");
        son.display();


        System.out.println(); // Add a blank line for readability

        Gfather gfather1 = new Father("Father name ", "Gfather name");
        gfather1.display();

        father.setF_name("new father name ");

        gfather1.setG_name("Gfather name ");
        gfather1.display();
        
}

}
