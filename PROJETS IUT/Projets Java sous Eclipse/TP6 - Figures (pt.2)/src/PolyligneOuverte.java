import java.util.*;
import java.awt.Graphics;

public class PolyligneOuverte extends Figure {
	
	private List<Point> liste = new LinkedList<Point>();
	
	public PolyligneOuverte(Point p1, Point p2) {
		liste.add(p1);
		liste.add(p2);
	}
	
	public int getNbPoints () {
		return this.liste.size();
	}
	
	public Point getIeme(int i) {
		return this.liste.get(i);
	}
	
	public void addIeme(int i, Point p) {
		this.liste.add(i, p);
	}
	
	public void removeIeme(int i) {
		this.liste.remove(i);
	}
	
	public double distance() {
		double somme = 0;
		if (liste.size() < 2) {
			for (int i =1; i <= liste.size(); i++) {
				
				somme += Math.sqrt(Math.pow(liste.get(i-1).getX() - liste.get(i).getX(), 2.0)
		                + Math.pow(liste.get(i-1).getY() - liste.get(i).getY(), 2.0));
			}
		}
		return somme;
	}
	
	public void tracer(Graphics g) {
		for (int i = 1 ; i < this.getNbPoints(); i++) {
			g.drawLine(this.getIeme(i-1).getX(), this.getIeme(i-1).getY(), this.getIeme(i).getX(), this.getIeme(i).getY());
		}
	}
}
