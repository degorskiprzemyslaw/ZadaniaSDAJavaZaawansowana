package zadanie4;

public class Circle extends Shape {
    private double radius;


    public Circle(){
        super();
        radius = 1;
    }

    public Circle(String color, boolean filledShape, double radius) {
        super(color, filledShape);
        this.radius = radius;
    }


    public double getArea(){
        return Math.pow(radius, 2) * Math.PI;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }





    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle with radius = " + radius + " which is a subclass off: " + super.toString();
    }
}
