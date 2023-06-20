package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String input = scanner.nextLine();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        int input;

        do {
            System.out.print("Enter an integer between " + min + " and " + max + ": ");
            input = scanner.nextInt();
        } while(input < min || input > max);

        return input;
    }

    public int getInt() {
        System.out.print("Enter an integer: ");
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double input;

        do {
            System.out.print("Enter a decimal number between " + min + " and " + max + ": ");
            input = scanner.nextDouble();
        } while(input < min || input > max);

        return input;
    }

    public double getDouble() {
        System.out.print("Enter a decimal number: ");
        return scanner.nextDouble();
    }
}
