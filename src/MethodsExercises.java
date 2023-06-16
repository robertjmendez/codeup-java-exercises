import java.util.Scanner;

public class MethodsExercises {
    private static final Scanner scanner = new Scanner(System.in);

    // Create four separate methods. Each will perform an arithmetic operation:
    // Addition
    // Subtraction
    // Multiplication
    // Division
    // Each function needs to take two parameters/arguments so that the operation can be performed.
    // Test your methods and verify the output.
    // Add a modulus method that finds the modulus of two numbers.

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

    public static int multiplication(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }

    // 2. Create a method that validates that user input is in a certain range and returns that input as an integer if it
    // is within the given range. If not, prompt the user to input their number again until the input is within range.
    // The method signature should look like this:
    // public static int getInteger(int min, int max);
    // and is used like this:
    // System.out.print("Enter a number between 1 and 10: ");
    // int userInput = getInteger(1, 10);
    public static int getInteger(int min, int max) {
        int userInput = scanner.nextInt();

        if (userInput < min || userInput > max) {
            System.out.printf("Please enter a number between %d and %d: ", min, max);
            return getInteger(min, max);
        }

        return userInput;
    }

    public static void getAndPrintUserInput() {
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        System.out.print("You entered: " + userInput);
        System.out.println();
    }
    // 3. Calculate the factorial of a number.
    // Prompt the user to enter an integer from 1 to 10.
    // Display the factorial of the number entered by the user.
    // Ask if the user wants to continue.
    // Use a for loop to calculate the factorial.
    // Assume that the user will enter an integer, but verify it’s between 1 and 10.
    // Use the long type to store the factorial.
    // Continue only if the user agrees to.
    // A factorial is a number multiplied by each of the numbers before it.
    // Factorials are denoted by the exclamation point (n!). Ex:
    // 1! = 1               = 1
    // 2! = 1 x 2           = 2
    // 3! = 1 x 2 x 3       = 6
    // 4! = 1 x 2 x 3 x 4   = 24

    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void computeFactorial() {
        do {
            System.out.print("Enter a number between 1 and 10: ");
            int userInput2 = scanner.nextInt();

            if (userInput2 < 1 || userInput2 > 10) {
                System.out.println("Please enter a number between 1 and 10.");
                continue;
            }

            long result = factorial(userInput2);
            System.out.printf("%d! equals: %d%n", userInput2, result);

            System.out.println("Would you like to continue? [y/n] ");
            String userResponse = scanner.next();
            if (!userResponse.equalsIgnoreCase("y")) {
                break;
            }

        } while (true);
    }
    // 4. Create an application that simulates dice rolling.
    // Ask the user to enter the number of sides for a pair of dice.
    // Prompt the user to roll the dice.
    // "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
    // Use static methods to implement the method(s) that generate the random numbers.
    // Use the .random method of the java.lang.Math class to generate random numbers.
    public static int rollDie(int numberOfSides) {
        int result = (int) (Math.random() * numberOfSides) + 1;
        return result;
    }

    public static void rollDice() {
        String userResponse;

        do {
            System.out.print("Enter the number of sides for a pair of dice: ");
            int numberOfSides = scanner.nextInt();

            int firstRoll = rollDie(numberOfSides);
            int secondRoll = rollDie(numberOfSides);

            System.out.printf("You rolled a %d and a %d.%n", firstRoll, secondRoll);
            System.out.println("Would you like to roll again? [y/n] ");
            userResponse = scanner.next();
        } while (userResponse.equalsIgnoreCase("y"));
    }

    public static void main(String[] args) {

        System.out.println(addition(5, 5));
        System.out.println(subtraction(10, 5));
        System.out.println(multiplication(5, 5));
        System.out.println(division(25, 5));
        System.out.println(modulus(10, 5));

        getAndPrintUserInput();
        computeFactorial();
        rollDice();
    }
}
