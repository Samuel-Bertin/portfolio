
public class ClientCompteurKilo {
		
	public static void main (String[]args) {
		CompteurKilo ck = new CompteurKilo();
		for (int i = 0 ; i < 1000; i++) {
			System.out.println(ck);
			try {
				ck.ajouterUn();
			} catch (CompteurException e) {
				e.printStackTrace();
			}
		}
	}
	
}
