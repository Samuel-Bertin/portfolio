import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VueMastermind extends JPanel {
	
	private static final long serialVersionUID = 1L;
	static int NBMAX_COMBINAISONS = 10;
	private int nbCouleurs = 6;
	private int taille = 4;
	private JTextField [] bPIHM = new JTextField[NBMAX_COMBINAISONS];
	private JTextField [] mPIHM  = new JTextField[NBMAX_COMBINAISONS];
	private JTextField [] combinaisonOrdiIHM = new JTextField[taille];
	private JButton [][] combinaisonsJoueurIHM = new JButton[NBMAX_COMBINAISONS][taille];
	private JButton [] paletteIHM =  new JButton[nbCouleurs];

	
	
	public VueMastermind() {
		
		this.setLayout(new BorderLayout());
		
		partieHaute();
		
		JPanel grille = creerGrilleCentrale();
		
		premiereLigneGrille(grille);
		
		premierScoreLigneGrille(grille);
		
		ajouterLignesEtScoresRestants(grille);
		
		partieBasse();
		
	}
	
	public void activerCombinaison(int i) {
		for (int = j)
	}
		
	}

	public void ajouterLignesEtScoresRestants(JPanel grille) {
		for (int i = 1; i<10; i++) {
			
			JPanel ligne = new JPanel();
			ligne.setLayout(new GridLayout(1,4));
			for (int j=0; j<4; j++) {
				JButton caseGrille = new JButton();
				caseGrille.setEnabled(false);
				this.combinaisonsJoueurIHM[i][j] = caseGrille;
				ligne.add(caseGrille);
			} 
			grille.add(ligne);

			JPanel scoreLigne = new JPanel();
			scoreLigne.setLayout(new GridLayout(2,2));
			JLabel labelMP = new JLabel("MP");
			JLabel labelBP = new JLabel("BP");
			JTextField textMP = new JTextField();
			mPIHM[i] = textMP;
			JTextField textBP = new JTextField();
			bPIHM[i] = textBP;
			textMP.setEnabled(false);
			textBP.setEnabled(false);
			scoreLigne.add(labelMP);
			scoreLigne.add(labelBP);
			scoreLigne.add(textMP);
			scoreLigne.add(textBP);
			grille.add(scoreLigne);
			
		}
	}

	public void premierScoreLigneGrille(JPanel grille) {
		JPanel scoreLigne = new JPanel();
		scoreLigne.setLayout(new GridLayout(2,2));
		JLabel labelMP = new JLabel("MP");
		JLabel labelBP = new JLabel("BP");
		JTextField textMP = new JTextField();
		mPIHM[0] = textMP;
		JTextField textBP = new JTextField();
		bPIHM[0] = textBP;
		textMP.setEnabled(false);
		textBP.setEnabled(false);
		scoreLigne.add(labelMP);
		scoreLigne.add(labelBP);
		scoreLigne.add(textMP);
		scoreLigne.add(textBP);
		grille.add(scoreLigne);
	}

	public void premiereLigneGrille(JPanel grille) {
		JPanel ligne = new JPanel();
		ligne.setLayout(new GridLayout(1,4));
		for (int j=0; j<4; j++) {
			JButton caseGrille = new JButton();
			this.combinaisonsJoueurIHM[0][j] = caseGrille;
			ligne.add(caseGrille);
		} 
		grille.add(ligne);
	}

	public void ajouterScoreDeLigne(JPanel grille) {
		
	}

	public void partieBasse() {
		
		JPanel bas = new JPanel();
		bas.setLayout(new GridLayout(1,2));
		JPanel guess = new JPanel();
		guess.setLayout(new GridLayout(1,4));
		JButton valider = new JButton("Valider");
		bas.add(guess);
		bas.add(valider);
		
		for (int j = 0; j<4; j++) {
			JTextField caseGuess = new JTextField();
			caseGuess.setEnabled(false);
			this.combinaisonOrdiIHM[j] = caseGuess;
			guess.add(caseGuess);
		}
		this.add(bas,BorderLayout.SOUTH);
	}

	public JPanel creerGrilleCentrale() {
		
		JPanel grille = new JPanel();
		grille.setLayout(new GridLayout(10,2));
		this.add(grille);
		return grille;
	}

	public void partieHaute() {
		
		JPanel couleurs = new JPanel();
		JLabel labelCouleur = new JLabel("Couleurs");
		JPanel boutonsCouleurs = new JPanel();
		boutonsCouleurs.setLayout(new GridLayout(1,6));
		
		couleurs.setLayout(new FlowLayout());
		couleurs.add(labelCouleur);
		
		JButton bleu = new JButton();
		bleu.setBackground(Color.BLUE);
		boutonsCouleurs.add(bleu);
		this.paletteIHM[0] = bleu;
		
		JButton rouge = new JButton();
		rouge.setBackground(Color.RED);
		boutonsCouleurs.add(rouge);
		this.paletteIHM[1] = rouge;
		
		JButton vert = new JButton();
		vert.setBackground(Color.GREEN);
		boutonsCouleurs.add(vert);
		this.paletteIHM[2] = vert;
		
		JButton jaune = new JButton();
		jaune.setBackground(Color.YELLOW);
		boutonsCouleurs.add(jaune);
		this.paletteIHM[3] = jaune;
		
		JButton cyan = new JButton();
		cyan.setBackground(Color.CYAN);
		boutonsCouleurs.add(cyan);
		this.paletteIHM[4] = cyan;
		
		JButton rose = new JButton();
		rose.setBackground(Color.MAGENTA);
		boutonsCouleurs.add(rose);
		this.paletteIHM[5] = rose;
		
		couleurs.add(boutonsCouleurs);
		
		this.add(couleurs, BorderLayout.NORTH);
	}
	
}
