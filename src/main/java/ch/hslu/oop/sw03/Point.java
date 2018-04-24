package ch.hslu.oop.sw03;

public class Point {
	private int x,y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public static void main(String [] args)
	{
		Point point = new Point(0,0);
		int quadrant = point.getQuadrant(point.x, point.y);
		System.out.print(quadrant);
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
}
