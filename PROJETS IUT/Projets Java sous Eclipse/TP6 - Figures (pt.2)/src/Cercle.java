import java.awt.Graphics;
public class Cercle extends FigureFerm�e {


	public Cercle(Point p1, Point p2) {
		super(p1,p2);
	}
	
	public double getRayon() {
		return Point.distance(getPoint1(), getPoint2());
	}
	
	public double getDiam�tre() {
		return 2 * (Point.distance(getPoint1(), getPoint2()));
	}
	
	
	public double getP�rim�tre() {
		return 2 * Math.PI * Point.distance(getPoint1(), getPoint2());
	}
	
	public double getSurface() {
		return Math.PI * Math.pow(Point.distance(getPoint1(), getPoint2()), 2);
	}
	
	public void tracer(Graphics g) {
		g.drawOval((int)(this.getPoint1().getX()-this.getRayon()),(int)(this.getPoint1().getY()-this.getRayon()), (int)this.getDiam�tre(), (int)this.getDiam�tre());
	}
	
	public String toString() {
		String chaine = "";
		chaine += "Point 1 : Point [x="+this.getPoint1().getX()+" , y="+this.getPoint1().getY()+"] Point 2 : Point [x="+this.getPoint2().getX()+" , y="+this.getPoint2().getY()+"] P�rim�tre"
				+ " : "+this.getP�rim�tre()+" Surface : "+ this.getSurface()+" Rayon : "+this.getRayon()+" Diam�tre : "+this.getDiam�tre();
		return chaine;
	}
}
