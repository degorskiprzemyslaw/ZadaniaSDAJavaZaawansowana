package zadanie3;

public class Rectangle extends Shape{
    private double area;
    private double width;
    private double length;

    public Rectangle(){
        super();
        width = 1;
        length = 1;
    }

    public Rectangle(String color, boolean filledShape, double width, double length) {
        super(color, filledShape);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle with width = " + width +
                " and length = " + length +
                " which is a subclass of: " + super.toString();
    }
}
