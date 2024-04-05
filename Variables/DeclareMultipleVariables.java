package Java.Variables;

public class DeclareMultipleVariables {
    
public static void main(String[] args) {
    
    // before
    int x = 5;
    int y = 6;
    int z = 50;
    System.out.println(x + y + z);

    //AFTER
    int x1 = 5, y1 = 6, z1 = 50;
    System.out.println(x1 + y1 + z1);

}



}
