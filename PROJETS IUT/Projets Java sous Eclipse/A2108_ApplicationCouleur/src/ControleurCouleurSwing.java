import java.awt.Color;

import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class ControleurCouleurSwing implements CaretListener {
	
	VueCouleurSwing v;
	
	public ControleurCouleurSwing(VueCouleurSwing vue) {
		this.v = vue;
	}
	
	@Override
	public void caretUpdate(CaretEvent e) {
		
		Color c;
        // convertir le contenu du premier champ de texte
        // en un entier pour obtenir la nuance rouge
        int v1 = Integer.parseInt(this.v.getValeurRouge().getText());
        // convertir le contenu du deuxieme champ de texte
        // en un entier pour obtenir la nuance verte
        int v2 = Integer.parseInt(this.v.getValeurVert().getText());
        // convertir le contenu du troisieme champ de texte
        // en un entier pour obtenir la nuance bleue
        int v3 = Integer.parseInt(this.v.getValeurBleu().getText());
        // creer une couleur a partir des 3 nuances obtenues
        c = new Color(v1, v2, v3);
        // changer la couleur de fond du canevas couleurRVB
        // a partir de la nouvelle couleur obtenue
        this.v.setCouleur(c);

	}

}
