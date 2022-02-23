public class TD4 {

	public static void main (String[] args) {
		
		Compteur c = new CompteurEntier();
		while (c.getValeur() != 7) {
			c.ajouterUn();
		}
		
		System.out.print(c.getValeur());
		
	}
}
