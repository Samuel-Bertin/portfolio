import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class VueJeton extends JPanel {
	
	public VueJeton() {
		
		this.setLayout(new GridLayout(2,2));
		ControleurJeton controleur = new ControleurJeton(this);
		
		for (int i = 0; i < 4 ; i ++) {
			JButton bouton = new JButton();
			this.add(bouton);
			bouton.addActionListener(controleur);
			if (i == 0) {
				bouton.setIcon(new ImageIcon("D:\\DUT\\COURS\\MATIERES\\Algorithme\\JAVA\\ECLIPSEDD\\A2108_Jeton\\src\\image.jpg"));
			}
		}	
	}
	
	public boolean estCaseVide(JButton b) {
		if (b.getIcon() != null) {
			return false;
		} return true;
	}
	
	public void deplacerJeton(JButton a, JButton b) {
		if (!this.estCaseVide(a)) {
			a.setIcon(null);
			b.setIcon(new ImageIcon("D:\\DUT\\COURS\\MATIERES\\Algorithme\\JAVA\\ECLIPSEDD\\A2108_Jeton\\src\\image.jpg"));
		}
	}
	
}
