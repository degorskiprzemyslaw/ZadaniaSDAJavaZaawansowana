package zadanie5;

public class Zadanie5Demo {

    public static void main(String[] args) {

        Line line1 = new Line(new Point2D(0, 0), new Point2D(3, 5));
        System.out.println(line1);

        Line line2 = new Line(5, 9, 12, -5);
        System.out.println(line2);

        System.out.println(line2.getLineLength());

        System.out.println(line1.getMiddlePointOfLine());
        System.out.println(line2.getMiddlePointOfLine());
    }



}
