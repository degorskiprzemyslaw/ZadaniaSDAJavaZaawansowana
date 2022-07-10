package zadanie5;

public class Line {

    private Point2D startingPointOfLine;
    private Point2D endingPointOfLine;

    public Line(Point2D startingPointOfLine, Point2D endingPointOfLine) {
        this.startingPointOfLine = startingPointOfLine;
        this.endingPointOfLine = endingPointOfLine;
    }

    public Line(float xPoint1, float yPoint1, float xPoint2, float yPoint2){

        this.startingPointOfLine = new Point2D(xPoint1, yPoint1);
        this.endingPointOfLine = new Point2D(xPoint2, yPoint2);

        /* startingPointOfLine.setX(xPoint1);
        startingPointOfLine.setY(yPoint1);
        endingPointOfLine.setX(xPoint2);
        endingPointOfLine.setY(yPoint2);*/

    }

    public float getLineLength(){
        return (float) (Math.sqrt(Math.pow(startingPointOfLine.getX() - endingPointOfLine.getX(), 2) +
                                Math.pow(startingPointOfLine.getY() - endingPointOfLine.getY(), 2)));
    }

    public Point2D getMiddlePointOfLine(){
        float middlePointX = (endingPointOfLine.getX() + startingPointOfLine.getX()) / 2;
        float middlePointY = (endingPointOfLine.getY() + startingPointOfLine.getY()) / 2;
        return new Point2D(middlePointX, middlePointY);
    }

    public Point2D getStartingPointOfLine() {
        return startingPointOfLine;
    }

    public void setStartingPointOfLine(Point2D startingPointOfLine) {
        this.startingPointOfLine = startingPointOfLine;
    }

    public Point2D getEndingPointOfLine() {
        return endingPointOfLine;
    }

    public void setEndingPointOfLine(Point2D endingPointOfLine) {
        this.endingPointOfLine = endingPointOfLine;
    }



    @Override
    public String toString() {
        return "Line{" +
                "startingPointOfLine=" + startingPointOfLine +
                ", endingPointOfLine=" + endingPointOfLine +
                '}';
    }
}
