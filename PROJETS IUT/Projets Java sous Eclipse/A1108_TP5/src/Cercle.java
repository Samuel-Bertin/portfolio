
public class Cercle {

	private Point p1;
	private Point p2;
	
	
	public Cercle(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public double getRayon() {
		return Point.distance(p1, p2);
	}
	
	public double getDiamètre() {
		return 2 * (Point.distance(p1, p2));
	}
	
	public Point getPoint1() {
		return p1;
	}
	
	public Point getPoint2() {
		return p2;
	}
	
	public double getPérimètre() {
		return 2 * Math.PI * Point.distance(p1, p2);
	}
	
	public double getSurface() {
		return Math.PI * Math.pow(Point.distance(p1, p2), 2);
	}
}
