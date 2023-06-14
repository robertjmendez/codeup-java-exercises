import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f.%n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();

        System.out.println("User input: " + userInput);
        scanner.nextLine();

        // Prompt and store 3 words
        System.out.print("Enter the first word: ");
        String word1 = scanner.nextLine();

        System.out.print("Enter the second word: ");
        String word2 = scanner.nextLine();

        System.out.print("Enter the third word: ");
        String word3 = scanner.nextLine();

        System.out.println("You entered:");
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

        // Prompt and store a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("Entered sentence: " + sentence);

        // Prompt for length
        System.out.print("Enter the length of the classroom: ");
        String lengthInput = scanner.nextLine();
        int length = Integer.parseInt(lengthInput);

        // Prompt for width
        System.out.print("Enter the width of the classroom: ");
        String widthInput = scanner.nextLine();
        int width = Integer.parseInt(widthInput);

        // Calculate area and perimeter
        int area = length * width;
        int perimeter = 2 * (length + width);


        System.out.println("Area of the classroom: " + area);
        System.out.println("Perimeter of the classroom: " + perimeter);
    }
}
