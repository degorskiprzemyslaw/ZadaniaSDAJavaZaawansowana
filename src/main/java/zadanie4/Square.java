package zadanie4;



public class Square extends Rectangle {

    private double side;

    public Square() {
        super();
    }

    public Square(String color, boolean filledShape, double side) {
        super(color, filledShape, side, side);
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "Square with side = " + getSide() +
                " which is a subclass of: " + super.toString();
    }
}
