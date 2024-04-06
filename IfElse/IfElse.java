package Java.IfElse;

public class IfElse {

    public static void main(String[] args) {
        
        /*
         Less than: a < b
        Less than or equal to: a <= b
        Greater than: a > b
        Greater than or equal to: a >= b
        Equal to a == b
        Not Equal to: a != b



        if (condition) {
            // block of code to be executed if the condition is true
        }
         */

         if (20 > 18) {
            System.out.println("20 is greater than 18");
          }

          if (20 != 18) {
            System.out.println("20 is not equal to 18");
          }


        int x = 20;
        int y = 18;
        if (x > y) {
        System.out.println("x is greater than y");
        }

        //---------------------------- forget the yellow is saying to follow the above condition

        // The else Statement
        int a = 20;
        int b = 21;
        if (a > b) {
        System.out.println("a is greater than b");
        }
        else{
            System.out.println("a is less than b");
        }

        // another example
        int time = 20;
        if (time < 18) {
        System.out.println("Good day.");
        } else {
        System.out.println("Good evening.");
        }


        System.out.println("");

        int time1 = 22;
        if (time1 < 10) {
        System.out.println("Good morning.");
        } else if (time1 < 18) {
        System.out.println("Good day.");
        } else {
        System.out.println("Good evening.");
        }

    }
    
}
