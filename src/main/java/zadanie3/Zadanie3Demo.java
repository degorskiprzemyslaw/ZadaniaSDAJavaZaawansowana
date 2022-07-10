package zadanie3;

public class Zadanie3Demo {
    public static void main(String[] args) {

        Shape shape1 = new Shape();
        Shape shape2 = new Shape("red", true);
        Shape shape3 = new Shape("blue", false);

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
        rectangle1.setLength(9);
        System.out.println(rectangle1);

        Square square1 = new Square("green", false, 18);

        System.out.println(square1.getArea());
        System.out.println(square1.getPerimeter());
        System.out.println(square1);
        System.out.println(square1.getSide());
        square1.setSide(8);
        System.out.println(square1.getSide());
        System.out.println(square1);
        System.out.println(square1.getArea());
        System.out.println(square1.getPerimeter());



    }




}
