import java.awt.GridLayout;

import javax.swing.JFrame;

public class FenetreMastermind extends JFrame {
	
	
	public FenetreMastermind() {
		super("Mastermind");
		this.setLayout(new GridLayout(1,1));
		this.add(new VueMastermind());
		this.pack();
		this.setVisible(true);
		this.setSize(300,700);
	}
		
	
}
