package Java.Switch;

public class Switch {
    public static void main(String[] args) {
        // The switch statement selects one of many code blocks to be executed:

        /*
        switch(expression) {
        case x:
            // code block
            break;
        case y:
            // code block
            break;
        default:
            // code block
        }
         */


        int day = 4;
        switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        }

        System.out.println("");


        // another example
        int day1 = 4;
        switch (day1) {
        case 6:
            System.out.println("Today is Saturday");
            break;
        case 7:
            System.out.println("Today is Sunday");
            break;
        default:
            System.out.println("Looking forward to the Weekend");
        }



        System.out.println("");

        
        // another example
        String days = "Mo";
        switch (days) {
        case "Mo":
            System.out.println("Today is Monday");
            break;
        case "Tu":
            System.out.println("Today is Tuestday");
            break;
        default:
            System.out.println("Looking forward to the Weekend");
        }
    
    }

}
