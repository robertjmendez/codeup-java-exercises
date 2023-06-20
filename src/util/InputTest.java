package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.print("Enter a string: ");
        String stringInput = input.getString();
        System.out.printf("You Entered: %s%n", stringInput);

        System.out.print("Enter yes or no: ");
        boolean booleanInput = input.yesNo();
        System.out.printf("You Entered: %s%n", booleanInput ? "yes" : "no");

        int intInput = input.getInt(1, 50);
        System.out.printf("You entered: %d%n ", intInput);

        intInput = input.getInt();
        System.out.printf("You Entered: %d%n", intInput);

        double doubleInput = input.getDouble(1.0, 10.0);
        System.out.println("You entered: " + doubleInput);

        doubleInput = input.getDouble();
        System.out.println("You entered: " + doubleInput);


    }
}
