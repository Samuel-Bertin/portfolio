import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Focus implements FocusListener {
	
	PanneauCouleur p;
	
	public Focus(PanneauCouleur p) {
		this.p = p;
	}
	
	@Override
	public void focusGained(FocusEvent e) {

	}

	@Override
	public void focusLost(FocusEvent e) {
		int r = Integer.parseInt(this.p.getRouge());
		int v = Integer.parseInt(this.p.getVert());
		int b = Integer.parseInt(this.p.getBleu());
		this.p.setCouleur(new Color(r, v, b));
	}

}
