package Animal;
public class Animal1 {

     void sound() {
      System.out.println("\nAnimal makes a sound");
    }
  }
  
  class Dog extends Animal1 {

    @Override
    void sound() {
      System.out.println("\nDog barks");
    }
  }

  // cat

  class Cat extends Animal1 {

    @Override
    void sound() {
      System.out.println("\nCat meow meow e");
    }
  }


   class Main {
    public static void main(String[] args) {
    
        Animal1 a1 = new Animal1();// Animal1 reference and object
        a1.sound();//Animal makes a sound

        Dog  d1 = new Dog();// Dog reference and object
        d1.sound();// Dog barks


        Cat  c1 = new Cat();// Cat reference and object
        c1.sound();// Cat meow meow e



        Animal1 a2 = new Dog();// Animal1 reference but Dog object
        a2.sound();// Dog barks

        Animal1 a3 = new Cat();// Animal1 reference but Cat object
        a3.sound();// Cat meow meow e


        // short
        Animal1 allanimal;
        allanimal = new Dog();// Animal1 reference but Dog object
        allanimal.sound();// Dog barks

        allanimal = new Cat();// Animal1 reference but Cat object
        allanimal.sound();// Cat meow meow e


        /* 
        Animal1 myAnimal1 = new Animal1();
  
        myAnimal1.sound(); // Calls the Animal's sound method
    
        Animal1 allAnimal = new Dog();
        allAnimal.sound(); // Calls the Dog's sound method

        allAnimal = new Cat();
        allAnimal.sound(); // Calls the Cat's sound method
        */

    }
  }
  
  