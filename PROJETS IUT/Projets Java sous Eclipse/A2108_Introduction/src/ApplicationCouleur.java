import java.awt.*;
public class ApplicationCouleur {
	
	public static void main(String[]args) {
		
		Frame f = new Frame();
		f.setTitle("Conversion Couleur RVB");
		f.setSize(300,200);
		f.setLayout(new GridLayout(1,1));
		f.add(new PanneauCouleur());
		
		// Penser a ajouter ces lignes a chaque frame
		f.setVisible(true);
		f.pack();
	}
	
}
