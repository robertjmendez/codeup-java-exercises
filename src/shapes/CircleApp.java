package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.print("Enter the radius of the circle: ");
        double radius = input.getDouble();

        Circle circle = new Circle(radius);
        System.out.printf("Area of the circle: %.2f%n", circle.getArea());
        System.out.printf("Circumference of the circle: %.2f%n", circle.getCircumference());
    }
}
