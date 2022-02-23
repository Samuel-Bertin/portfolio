import javax.swing.JFrame;
import java.awt.*;
public class ApplicationMorpion {
	
	public static void main(String []args) {
		JFrame f = new JFrame();
		f.setTitle("Morpion");
		VueMorpion morpion = new VueMorpion();
		
		f.setLayout(new GridLayout(1,1));
		f.add(morpion);
		f.pack();
		f.setVisible(true);
		f.setSize(300,300);
	}
	
}
