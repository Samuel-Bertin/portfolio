import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Controleur implements ActionListener {
	
	private enum EtatControleur {
		JOUEUR1, JOUEUR2
	};
	
	private VueMorpion v;
	private ModeleMorpion m;
	private EtatControleur state;
	private boolean partieFinie;
	
	public Controleur(VueMorpion v) {
		this.v = v;
		this.m = new ModeleMorpion();
		this.setState(EtatControleur.JOUEUR1);
		this.partieFinie = false;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton source = (JButton)e.getSource();
		if (source.getText().equals("Effacer")) {
			this.v.initialiser();
			this.m.initialiser();
			this.partieFinie = false;
			this.setState(EtatControleur.JOUEUR1);
		} else {
			switch(this.getState()) {
				case JOUEUR1:
					if (!this.partieFinie) {
						source.setText("O");
						source.setEnabled(false);
						int coordoneeX = this.v.coordonneesBtCaseGrille(source).getPremier();
						int coordoneeY = this.v.coordonneesBtCaseGrille(source).getSecond();
						this.m.setValeurCase(coordoneeX, coordoneeY, TypeCase.JOUEUR1);
						System.out.println(this.m);
						if (this.m.casesAlignées(coordoneeX, coordoneeY)) {
							this.v.afficherResultat(1);
							this.partieFinie = true;
						} else {
							this.v.afficherJoueurCourant(2);
						}
					this.setState(EtatControleur.JOUEUR2);
					}
					break;
				case JOUEUR2:
					if (!this.partieFinie) {
						source.setText("X");
						source.setEnabled(false);
						int coordoneeX = this.v.coordonneesBtCaseGrille(source).getPremier();
						int coordoneeY = this.v.coordonneesBtCaseGrille(source).getSecond();
						this.m.setValeurCase(coordoneeX, coordoneeY, TypeCase.JOUEUR2);
						System.out.println(this.m);
						if (this.m.casesAlignées(coordoneeX, coordoneeY)) {
							this.v.afficherResultat(2);
							this.partieFinie = true;
						} else {
							this.v.afficherJoueurCourant(1);
						}
					}
					this.setState(EtatControleur.JOUEUR1);
					break;
			};
		}
		
	}
	
	public void setState(EtatControleur s) {
		this.state = s;
	}
	
	public EtatControleur getState() {
		return this.state;
	}

}
