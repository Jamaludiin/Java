package Java.GuessNumberGame;
import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Welcome to the Guess Number Game!");
        System.out.print("Please enter your name: ");
        String playerName = scanner.nextLine();
        
        System.out.print("Hello, " + playerName + "! Do you want to start a game? (yes/no): ");
        String startGame = scanner.nextLine();
        
        if (startGame.equalsIgnoreCase("yes") || startGame.equals("1")) {
            System.out.println("Great! Let's start the game.");
            int randomNumber = random.nextInt(10) + 1; // Generate a random number between 1 and 10
            int attempts = 0;

            while (attempts < 5) {
                System.out.print("Guess the number (between 1 and 10): ");
                int guess = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                if (guess == randomNumber) {
                    System.out.println("Congratulations, " + playerName + "! You guessed the correct number.");
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("The number you guessed is too low. Try again.");
                } else {
                    System.out.println("The number you guessed is too high. Try again.");
                }
                attempts++;
            }

            if (attempts == 5) {
                System.out.println("Sorry, " + playerName + "! You've used all your attempts. The correct number was: " + randomNumber);
            }
        } else {
            System.out.println("Maybe next time. Goodbye, " + playerName + "!");
        }
        
        scanner.close();
    }
}
