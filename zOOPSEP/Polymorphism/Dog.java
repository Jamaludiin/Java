package Polymorphism;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("The dog is sleeping");
    }
    
}
