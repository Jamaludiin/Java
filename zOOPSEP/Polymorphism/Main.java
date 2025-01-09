package Polymorphism;

public class Main {
    public static void main(String[] args) {


        System.out.println(); // Add a blank line for readability
        System.out.println("-----------------------------------------");
       
        System.out.println("Polymorphism      Cat");
        
        Cat cat = new Cat();
        cat.makeSound();
        cat.eat();
        cat.sleep();

        System.out.println(); // Add a blank line for readability
        System.out.println("-----------------------------------------");
       
        System.out.println("Polymorphism      Cat");
        
        Animal cat1 = new Cat();
        cat1.makeSound();
        cat1.eat();
        cat1.sleep();

        System.out.println(); // Add a blank line for readability
        System.out.println("-----------------------------------------");
        System.out.println("Polymorphism      Dog");
        Dog dog = new Dog();

        dog.makeSound();
        dog.eat();
        dog.sleep();

        System.out.println(); // Add a blank line for readability
        System.out.println("-----------------------------------------");    
        System.out.println("Polymorphism      Dog");
        Animal dog2 = new Dog();
        dog2.makeSound();   
        dog2.eat();
        dog2.sleep();

}

}