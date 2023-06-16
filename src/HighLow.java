import java.util.Random;
import java.util.Scanner;

public class HighLow {
    // 5. Game Development 101
//Welcome to the world of game development!
//You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//The specs for the game are:
//Game picks a random number between 1 and 100.
//Prompts user to guess the number.
//All user inputs are validated.
//If user's guess is less than the number, it outputs "HIGHER".
//If user's guess is more than the number, it outputs "LOWER".
//If a user guesses the number, the game should declare "GOOD GUESS!"
    public static void main(String[] args) {
        guessNumberGame();
    }

    public static void guessNumberGame() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Guess a number between 1 and 100: ");
            int userGuess = scanner.nextInt();
            if (validateGuess(userGuess, randomNumber)) {
                break;
            }
        }
    }

    public static boolean validateGuess(int guess, int target) {
        if (guess < 1 || guess > 100) {
            System.out.println("Your guess is out of range.");
            return false;
        } else if (guess == target) {
            System.out.println("GOOD GUESS!");
            return true;
        } else if (guess < target) {
            System.out.println("HIGHER");
            return false;
        } else {
            System.out.println("LOWER");
            return false;
        }
    }
}
