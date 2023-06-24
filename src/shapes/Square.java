package shapes;

public class Square extends Rectangle{
    private double side;
    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getArea() {
        System.out.println("Square's getArea() method is called.");
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        System.out.println("Square's getPerimeter() method is called.");
        return 4 * side;
    }
}
