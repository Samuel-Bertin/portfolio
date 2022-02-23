import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class VueCouleurSwing extends JPanel {

	

	private JTextField valeurRouge;
	private JTextField valeurVert;
	private JTextField valeurBleu;
	
	private JTextField affichageCouleur;

	
	public VueCouleurSwing() {
		super();
		
		//Valeurs d'origine
		
		JLabel labelRouge = new JLabel("Rouge");
		JLabel labelVert = new JLabel("Vert");
		JLabel labelBleu = new JLabel("Bleu");
		JPanel affichageSaisie = new JPanel();
		this.affichageCouleur = new JTextField("");
		
		this.affichageCouleur.setBackground(Color.BLACK);
        this.valeurRouge = new JTextField("0");
        this.valeurVert = new JTextField("0");
        this.valeurBleu = new JTextField("0");
		
		// sélectionner le gestionnaire de mise en page du PanneauCouleur :
        // grille d'1 ligne et de 2 colonnes
        this.setLayout(new GridLayout(1, 2));
        
        this.add(this.affichageCouleur);
        
        this.add(affichageSaisie);
        
        affichageSaisie.setLayout(new GridLayout(3,2,20,20));
        
        affichageSaisie.add(labelRouge);

        affichageSaisie.add(this.valeurRouge);

        affichageSaisie.add(labelVert);

        affichageSaisie.add(this.valeurVert);

        affichageSaisie.add(labelBleu);

        affichageSaisie.add(this.valeurBleu);
        
        ControleurCouleurSwing controleur = new ControleurCouleurSwing(this);
        
        this.valeurRouge.addCaretListener(controleur);
        
        
        
	}
	
    public void setCouleur(Color c) {
        this.affichageCouleur.setBackground(c);
    }
	
	public JTextField getValeurRouge() {
		return valeurRouge;
	}

	public void setValeurRouge(JTextField valeurRouge) {
		this.valeurRouge = valeurRouge;
	}

	public JTextField getValeurVert() {
		return valeurVert;
	}

	public void setValeurVert(JTextField valeurVert) {
		this.valeurVert = valeurVert;
	}

	public JTextField getValeurBleu() {
		return valeurBleu;
	}

	public void setValeurBleu(JTextField valeurBleu) {
		this.valeurBleu = valeurBleu;
	}

	public JTextField getAffichageCouleur() {
		return affichageCouleur;
	}

	public void setAffichageCouleur(JTextField affichageCouleur) {
		this.affichageCouleur = affichageCouleur;
	}
}
