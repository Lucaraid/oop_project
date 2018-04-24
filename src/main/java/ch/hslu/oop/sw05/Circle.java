package ch.hslu.oop.sw05;

public class Circle extends Shape {
    private int diameter;

    public Circle(int x, int y, int diameter){
        super(x, y);
        this.diameter = diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    @java.lang.Override
    public int getPerimeter() {
        return (int)Math.PI * getDiameter();
    }

    @java.lang.Override
    public int getArea() {
        return (int)Math.PI * ((getDiameter()^2)/4);
    }
}
