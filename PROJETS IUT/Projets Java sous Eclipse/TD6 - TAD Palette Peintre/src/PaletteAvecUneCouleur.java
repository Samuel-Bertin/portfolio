import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PaletteAvecUneCouleur implements Palette {
	
	private Couleur couleurPalette;
	private int num�ro;
	
	//Consultation
	public boolean estPropre() {
		return (this.couleurPalette == null);
	}
	
	public Couleur couleur() {
		if (this.estPropre()) {
			throw new IllegalArgumentException("Palette pas encore initialis�e");
		} 
		return this.couleurPalette;
	}
	
	//Modification
	public void ajouter(Couleur c) throws IllegalArgumentException {
		if (this.couleurPalette != null) {
			this.couleurPalette = this.couleurPalette.m�langer(c,0.5f);
		} else {
			this.couleurPalette = c;
		}

	}
	
	public void essuyer() {
		this.couleurPalette = null;
	}
	
	//Evaluation
	public void display() {
        int rouge = this.couleur().getRouge();
        int vert = this.couleur().getVert();
        int bleu = this.couleur().getBleu();
		JFrame f = new JFrame();
		num�ro++;
		f.setTitle("Palette " + num�ro);
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
