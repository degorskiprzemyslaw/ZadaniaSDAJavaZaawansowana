package zadanie4;

public abstract class Shape {
    protected String color;
    protected boolean filledShape;

    public Shape(){
        color = "unknown";
        filledShape = false; //chyba nie musi byc po domyslnie false
    }
    public Shape(String color, boolean filledShape){
        this.color = color;
        this.filledShape = filledShape;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilledShape() {
        return filledShape;
    }

    public void setFilledShape(boolean filledShape) {
        this.filledShape = filledShape;
    }

    @Override
    public String toString() {
        if(filledShape){
            return "Shape with color of " + color + " and filled";
        }
        else{
            return "Shape with color of " + color + " and not filled";
        }

    }
}
