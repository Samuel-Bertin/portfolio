import java.awt.*;
public class UtilisationLayout {
	
	public static void main(String[]args) {
		
		Panel p = new Panel();
		
		// Flow Layout
		p.setLayout(new FlowLayout());
		for (int i=0; i<3; i++) {
			p.add(new Button("B"+i));
		}
		
		Panel g = new Panel();
		
		//GridLayout - 2 LIGNES - 3 COLONNES
		g.setLayout(new GridLayout(2,3));
		for (int i=0; i<3; i++) {
			g.add(new Button("B"+i));
		}
		
		Panel b = new Panel();
		
		//BorderLayout
		b.setLayout(new BorderLayout());
		b.add(new Button("B1"),BorderLayout.CENTER);
		b.add(new Button("B2"),BorderLayout.NORTH);
		b.add(new Button("B3"),BorderLayout.SOUTH);
		
	}
}
