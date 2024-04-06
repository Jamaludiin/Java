package Java.IfElse;

public class ShortHandIfElse {
    public static void main(String[] args) {

        // variable = (condition) ? expressionTrue :  expressionFalse;

        int time = 20;

        if (time < 18) {
        System.out.println("Good day.");
        } else {
        System.out.println("Good evening.");
        }


        // short hand
        int time1 = 20;
        String result = (time1 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}
