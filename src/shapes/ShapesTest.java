package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());


        Measurable myShape1 = new Rectangle(4, 5);
        System.out.println("Rectangle perimeter: " + myShape1.getPerimeter());
        System.out.println("Rectangle area: " + myShape1.getArea());

        Measurable myShape2 = new Square(5);
        System.out.println("Square perimeter: " + myShape2.getPerimeter());
        System.out.println("Square area: " + myShape2.getArea());

    // Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
    // If the Rectangle class doesn't have a getPerimeter method, the code won't compile because the Measurable interface requires it.

    // What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
    // You can't call getLength or getWidth on the myShape variable because it's a Measurable, which doesn't include those methods, even if the actual object is a Rectangle or Square.
    }
}
