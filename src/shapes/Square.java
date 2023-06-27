package shapes;

public class Square extends Quadrilateral{
//    private double side;
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    @Override
//    public double getArea() {
//        System.out.println("Square's getArea() method is called.");
//        return Math.pow(side, 2);
//    }
//
//    @Override
//    public double getPerimeter() {
//        System.out.println("Square's getPerimeter() method is called.");
//        return 4 * side;
//    }
public Square(double side) {
    super(side, side);
}

    @Override
    public void setWidth(double side) {
        this.width = this.length = side;
    }

    @Override
    public void setLength(double side) {
        this.width = this.length = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

}
