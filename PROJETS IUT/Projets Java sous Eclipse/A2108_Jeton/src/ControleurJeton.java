import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ControleurJeton implements ActionListener {
	
	VueJeton vue;
	public enum etats {ATTENTE_CLIC_DEPART, ATTENTE_CLIC_ARRIVEE}
	public etats etat;
	public JButton depart;
	
	public ControleurJeton(VueJeton v) {
		this.vue = v;
		this.etat = etats.ATTENTE_CLIC_DEPART;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		

		
		switch (this.etat) {
		case ATTENTE_CLIC_DEPART:
			if (!vue.estCaseVide((JButton)e.getSource())) {
				depart = (JButton)e.getSource();
				this.etat = etats.ATTENTE_CLIC_ARRIVEE;
			}
			break;
		case ATTENTE_CLIC_ARRIVEE:
			if (vue.estCaseVide((JButton)e.getSource())) {
				vue.deplacerJeton(depart, (JButton)e.getSource());
			}
			this.etat = etats.ATTENTE_CLIC_DEPART;
			break;
		}

	}

}
