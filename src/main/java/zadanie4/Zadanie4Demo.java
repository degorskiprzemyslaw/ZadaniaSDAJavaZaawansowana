package zadanie4;

public class Zadanie4Demo {
    public static void main(String[] args) {

        Shape shape1 = new Circle("white", false, 16);
        Shape shape2 = new Rectangle("red", true, 12, 15);
        Shape shape3 = new Square("blue", false, 86);

        System.out.println(shape1);
        System.out.println(shape2);
        System.out.println(shape3);

        Circle circle1 = new Circle("purple", true, 4);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1);

        Rectangle rectangle1 = new Rectangle("orange", true, 3, 5);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
        System.out.println(rectangle1);

    }




}
