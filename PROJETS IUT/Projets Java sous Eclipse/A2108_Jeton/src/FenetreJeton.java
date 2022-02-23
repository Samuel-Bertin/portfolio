import java.awt.GridLayout;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class FenetreJeton extends JFrame {
	
	public FenetreJeton() {
		super("Jeton");
		this.setLayout(new GridLayout(1,1));
		this.add(new VueJeton());
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}

}
