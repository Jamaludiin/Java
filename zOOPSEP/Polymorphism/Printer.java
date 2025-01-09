package Polymorphism;

public class Printer {
    // method
    public void print(String text) {
        System.out.println("Printing: " + text);
    }

    public void print(int number) {
        System.out.println("Printing: " + number);
    }

    public void print(double decimal) {
        System.out.println("Printing: " + decimal);
    }

    public void print(boolean bool) {
        System.out.println("Printing: " + bool);
    }

    public void print(char character) {
        System.out.println("Printing: " + character);
    }

    public void print(Object object) {
        System.out.println("Printing: " + object);
    }

    public void print(String[] array) {
        System.out.print("Printing: ");
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public void print(int[] array) {
        System.out.print("Printing: ");
        for (int element : array) {
            System.out.print(element + " ");
}

    }
}


class InnerPrinter {
    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.print("Hello, World!");
        printer.print(42);
        printer.print(3.14);
        printer.print(true);    
        printer.print('A');

        printer.print(new int[]{1, 2, 3, 4, 5});
       printer.print(new String[]{"\napple", "banana", "cherry"});

    
}
}