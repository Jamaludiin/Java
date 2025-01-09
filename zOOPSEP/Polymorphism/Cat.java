package Polymorphism;

public class Cat extends Animal {

 @Override
 public void makeSound() {
        System.out.println("The cat meows");
    } 

    @Override
    public void eat() {
        System.out.println("The cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("The cat is sleeping");
    }
    
}
