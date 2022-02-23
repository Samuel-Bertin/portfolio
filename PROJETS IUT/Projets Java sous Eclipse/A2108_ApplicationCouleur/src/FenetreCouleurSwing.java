import java.awt.GridLayout;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class FenetreCouleurSwing extends JFrame{
	
	public FenetreCouleurSwing() {
		super("Application Couleurs");
		this.setLayout(new GridLayout(1,1));
		this.add(new VueCouleurSwing());
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}

}
