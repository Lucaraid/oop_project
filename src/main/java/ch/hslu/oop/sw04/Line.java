package ch.hslu.oop.sw04;

/**
 *
 */
public class Line {
    private Point startPoint, endPoint;

    private int x1, y1, x2, y2;

    public static void main(String[] args) {
        Point startPoint = new Point(1,2);
        Point endPoint = new Point(3,4);
        Line line1 = new Line(startPoint, endPoint);
        Point newStartPoint = new Point(5, 6);
        line1.setStartPoint(newStartPoint);
        line1.startPoint.setX(2);

        Line line2 = new Line(11,12,13,14);
        line2.setStartPoint(15,16);
    }

    public Line(int x1, int y1, int x2, int y2 ) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.startPoint = new Point(x1,y1);
        this.endPoint = new Point(x2,y2);
    }

    public Line(Point point1, Point point2) {
        this.startPoint = point1;
        this.endPoint = point2;
    }

    public Point getStartPoint() {
        return this.startPoint;
    }

    public Point getEndPoint() {
        return this.endPoint;
    }

    public void setStartPoint(Point startPoint){
        this.startPoint = startPoint;
    }

    public void setEndPoint(Point endPoint){
        this.endPoint = endPoint;
    }

    public void setStartPoint(int x, int y){
        this.x1 = x;
        this.y1 = y;
    }

    public void setEndPoint(int x, int y){
        this.x2 = x;
        this.y2 = y;
    }
}
