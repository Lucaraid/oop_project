package ch.hslu.oop.sw06;

public class Rectangle extends Shape {
    private int width, height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public void changeDImension(int newWidth, int newHeight) {
        this.width = newWidth;
        this.height = newHeight;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getPerimeter() {
        return (getX() * 2) + (getY() * 2);
    }

    public int getArea() {
        return (getX() * getY());
    }
}
