import java.awt.Graphics;
public class Rectangle extends FigureFermée {
	


	public Rectangle(Point p1, Point p2) {
		super(p1,p2);
	}
	
	public int getLargeur() {
		return Math.abs(this.getPoint2().getX() - this.getPoint1().getX());
	}
	
	public int getHauteur( ) {
		return Math.abs(this.getPoint2().getY() - this.getPoint1().getY());
	}
	
	public double getPérimètre() {
		return 2 * ( Math.abs( this.getPoint2().getX() - this.getPoint1().getX() ) + Math.abs( this.getPoint2().getY() - this.getPoint1().getY() ) );
	}
	
	public double getSurface() {
		return  Math.abs( this.getPoint2().getX() - this.getPoint1().getX() ) * Math.abs( this.getPoint2().getY() - this.getPoint1().getY() );
	}
	
	public void tracer(Graphics g) {
		g.drawRect(this.getPoint1().getX(), this.getPoint1().getY(), this.getLargeur(), this.getHauteur());
	}
	
	public String toString() {
		String chaine = "";
		chaine += "Point 1 : Point [x="+this.getPoint1().getX()+" , y="+this.getPoint1().getY()+"] Point 2 : Point [x="+this.getPoint2().getX()+" , y="+this.getPoint2().getY()+"] Périmètre"
				+ " : "+this.getPérimètre()+" Surface : "+ this.getSurface()+" Largeur : "+this.getLargeur()+" Hauteur : "+this.getHauteur();
		return chaine;
	}

}
