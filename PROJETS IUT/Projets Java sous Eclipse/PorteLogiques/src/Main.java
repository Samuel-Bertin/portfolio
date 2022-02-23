/**
 * 
 * @author Samuel BERTIN
 * test des portes logiques
 */
public class Main {
	
	public static void main(String []args) {
		
		Porte p1 = new PorteOu(true, false);
		Porte p2 = new PorteEt(true, true);
		Porte p3 = new PorteEt(p1.sortie(),p2.sortie());
		System.out.println(p3);
	}

}
