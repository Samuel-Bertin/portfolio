import java.util.*;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField; 


public class PaletteAvecListeDeCouleurs implements Palette {

	private List<Couleur> liste = new LinkedList<Couleur>();
	private static int numéro;

	// Construction
	public PaletteAvecListeDeCouleurs() {
		liste.clear();
	}

	public boolean estPropre() {
		return (liste.size() == 0);
	}

	public void ajouter(Couleur c) {
		this.liste.add(c);
	}

	public void essuyer() {
		this.liste.clear();
	}

	public Couleur couleur() throws IllegalArgumentException {

		if (this.estPropre()) {
			throw new IllegalArgumentException("La palette n'a pas été encore initialisée à une couleur.");
		}

		Couleur couleurAMelanger = liste.get(0);
		if (liste.size() == 1) {
			return couleurAMelanger;
		} else {
			for (int i = 1; i < liste.size(); i++) {
				couleurAMelanger = couleurAMelanger.mélanger(liste.get(i), 0.5f);
			}
			return couleurAMelanger;
		}
	}
	
	public void display() {
        int rouge = this.couleur().getRouge();
        int vert = this.couleur().getVert();
        int bleu = this.couleur().getBleu();
		JFrame f = new JFrame();
		numéro++;
		f.setTitle("Palette " + numéro);
        f.setLayout(new BorderLayout());
        JPanel p = new JPanel();
        f.add(p, BorderLayout.CENTER);
        p.setBackground(new Color(rouge, vert, bleu));
        JTextField rvb = new JTextField();
        rvb.setText("(" + rouge + "," + vert + "," + bleu + ")");
        f.add(rvb, BorderLayout.SOUTH);
        f.pack();
        f.setSize(250, 250);
        f.setVisible(true);
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
        f.dispose();
	}
}
