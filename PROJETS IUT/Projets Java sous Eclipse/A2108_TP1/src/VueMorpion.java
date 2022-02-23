import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VueMorpion extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// haut = bandeau (bouton "effacer" + etiquette "Joueur")
	private JPanel haut;
	
	//Grille du morpion
	private JPanel grille;
	
	//Label joueur
	private JLabel label;
	
	//Label gagnant
	private JLabel gagnant;
	
	//Tableau de boutons
	private JButton[] boutonsGrille;
	

	public VueMorpion() {
		
		ActionListener controleur = new Controleur(this);
		
		//Création de la vue principale
		this.setLayout(new BorderLayout());
		haut = new JPanel();
		grille = new JPanel();
		this.gagnant = new JLabel(" ");
		this.add(haut, BorderLayout.NORTH);
		this.add(grille, BorderLayout.CENTER);
		this.add(gagnant, BorderLayout.SOUTH);
		
		//Création de la grille et de la partie haute
		haut.setLayout(new GridLayout(1,2));
		grille.setLayout(new GridLayout(3,3));
		
		//Ajout de la zone de texte et du bouton effacer dans la partie haute
		JButton effacer = new JButton("Effacer");
		this.label = new JLabel("");
		haut.add(effacer);
		haut.add(label);
		effacer.addActionListener(controleur);
		
		//Creer la grille et les boutons
		this.boutonsGrille = new JButton[9];
		for (int i = 0 ; i < 9 ; i ++) {
			this.boutonsGrille[i] = new JButton("");
			grille.add(this.boutonsGrille[i]);
			boutonsGrille[i].addActionListener(controleur);
		}
		
	}
	
	public Couple coordonneesBtCaseGrille(JButton b) {
		for (int i =0; i<9; i++) {
			if (this.boutonsGrille[i] == b) {
				return new Couple(i/3,i%3);
			} 	
		}
		return null;
	}
	
	public void initialiser() {
		for (JButton b : this.boutonsGrille) {
			b.setText("");
			b.setEnabled(true);
		}
		this.label.setText("Joueur 1");
		this.gagnant.setText("Partie en cours");
	}
	
	public void afficherResultat(int num) {
		this.gagnant.setText("Joueur "+num+" à gagné");
	}
	
	public void afficherJoueurCourant(int num) {
		this.label.setText("Joueur "+num);
	}
	
	
}
