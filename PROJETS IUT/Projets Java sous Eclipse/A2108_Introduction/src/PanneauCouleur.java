import java.awt.*;
import java.awt.event.FocusListener;

public class PanneauCouleur extends Panel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6479301555384295162L;
	
	private TextField r ;
	private TextField v ;
	private TextField b ;
	
	private Canvas c;

	public PanneauCouleur() {
		
		this.setLayout(new GridLayout(1,2));
		c = new Canvas();
		c.setBackground(Color.BLACK);
		this.add(c);
		
		Panel sub = new Panel();
		sub.setLayout(new GridLayout(3,2));
		
		r = new TextField("0");
		v = new TextField("0");
		b = new TextField("0");
		
		//Create focus listener
		FocusListener focus = new Focus(this);
		
		//Linking events to listener
		this.r.addFocusListener(focus);
		this.v.addFocusListener(focus);
		this.b.addFocusListener(focus);
		
		sub.add(new Label("Rouge"));
		sub.add(this.r);
		sub.add(new Label("Vert"));
		sub.add(this.v);
		sub.add(new Label("Bleu"));
		sub.add(this.b);
		
		this.add(sub);
		
	}
	
	public String getRouge() {
		return this.r.getText();
	}
	
	public String getVert() {
		return this.v.getText();
	}
	
	public String getBleu() {
		return this.b.getText();
	}
	
	public void setCouleur(Color couleur) {
		this.c.setBackground(couleur);
	}
	
}
