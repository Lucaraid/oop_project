package ch.hslu.oop.sw06;

public abstract class Shape {
    private int x, y;

    protected Shape(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public final void move(final int newX, final int newY) {
        this.x = newX;
        this.y = newY;
    }

    public abstract int getPerimeter();

    public abstract int getArea();
}
