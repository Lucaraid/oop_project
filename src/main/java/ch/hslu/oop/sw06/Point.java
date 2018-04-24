package ch.hslu.oop.sw06;

public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        this(point.getX(), point.getY());
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getQuadrant(int x, int y) {
        if ((x == 0) || (y == 0)) {
            return 0;
        }
        if (x > 0) {
            if (y > 0) {
                return 0;
            } else {
                return 4;
            }
        } else {
            if (y > 0) {
                return 2;
            } else {
                return 3;

            }
        }
    }

    public void moveRelative(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public void moveRelative(Point point) {
        this.moveRelative(point.x, point.y);
    }

    public void moveRelative(double alpha, int amount) {
        this.moveRelative((int)(amount * Math.cos(alpha)), (int)(amount * Math.sin(alpha)));
    }
}
