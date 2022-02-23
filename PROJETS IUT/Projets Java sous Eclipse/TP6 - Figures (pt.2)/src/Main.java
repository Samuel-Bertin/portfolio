import java.util.LinkedList;
import java.util.List;
public class Main {
	
	public static void main(String []args) {
		
		List<Figure> liste = new LinkedList<Figure>();
		/*Figure r1 = new Rectangle(new Point(50, 50), new Point(100, 100));
		liste.add(r1);
		Figure c1 = new Cercle(new Point(200,300), new Point(200,150));
		liste.add(c1);
		Figure r2 = new Rectangle(new Point(90,90), new Point(450,350));
		liste.add(r2);
		Figure c2 = new Cercle(new Point(120,250), new Point(120,300));
		liste.add(c2);
		Figure c3 = new Cercle(new Point(100,100), new Point(0,100));
		liste.add(c3);*/
		Figure p1 = new PolyligneOuverte(new Point(250,50), new Point(400,400));
		((PolyligneOuverte)(p1)).addIeme(2, new Point(50,150));
		((PolyligneOuverte)(p1)).addIeme(3, new Point(450,150));
		((PolyligneOuverte)(p1)).addIeme(4, new Point(100,400));
		((PolyligneOuverte)(p1)).addIeme(5, new Point(250,50));
		liste.add(p1);
		
		Figure p2 = new PolyligneOuverte(new Point(125, 400), new Point(125,450));
		((PolyligneOuverte)(p2)).addIeme(2, new Point(150,450));
		((PolyligneOuverte)(p2)).addIeme(3, new Point(150,400));		
		liste.add(p2);
		
		Figure p3 = new PolyligneOuverte(new Point(225,400), new Point (200,400));
		((PolyligneOuverte)(p3)).addIeme(2, new Point(200,425));
		((PolyligneOuverte)(p3)).addIeme(3, new Point(225,425));
		((PolyligneOuverte)(p3)).addIeme(4, new Point(225,450));
		((PolyligneOuverte)(p3)).addIeme(5, new Point(200,450));
		liste.add(p3);
		
		Figure p4 = new PolyligneOuverte(new Point(300,400), new Point (275,400));
		((PolyligneOuverte)(p4)).addIeme(2, new Point(275,425));
		((PolyligneOuverte)(p4)).addIeme(3, new Point(300,425));
		((PolyligneOuverte)(p4)).addIeme(4, new Point(300,450));
		((PolyligneOuverte)(p4)).addIeme(5, new Point(275,450));
		liste.add(p4);
		
		Figure p5 = new PolyligneOuverte(new Point(350,450), new Point(350,400));
		((PolyligneOuverte)(p5)).addIeme(2, new Point(375,400));
		((PolyligneOuverte)(p5)).addIeme(3, new Point(375,420));
		((PolyligneOuverte)(p5)).addIeme(4, new Point(350,420));	
		((PolyligneOuverte)(p5)).addIeme(5, new Point(375,450));		
		liste.add(p5);
		

		FenetreFigures fenetre = new FenetreFigures(liste);
		fenetre.mettreAJour(liste);

		for (Figure f: liste) {
			System.out.println(f);
		}
		

	}
	
}
