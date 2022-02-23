
public class Main {

	public static void main (String []args) {
		
		// TEST PALETTE DE COULEUR
		Palette palette = new PaletteAvecUneCouleur();
		Couleur jaune = new CouleurRVB(255,255,0);
		Couleur rouge = new CouleurRVB(255,0,0);
		Couleur bleu = new CouleurRVB(0,0,255);
		palette.ajouter(jaune);
		palette.display();
		palette.ajouter(rouge);
		palette.display();
		palette.ajouter(bleu);
		palette.display();
	}
	
}
