import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(100) + 1; // 1 to 100
        int guess;
        int attempts = 0;

        System.out.println("🎯 Welcome to Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100");

        while (true) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too Low ❌");
            } 
            else if (guess > randomNumber) {
                System.out.println("Too High ❌");
            } 
            else {
                System.out.println("🎉 Correct! You guessed the number.");
                System.out.println("Total Attempts: " + attempts);
                break;
            }
        }

        sc.close();
    }
}
