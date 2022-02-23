
public class Main {
	
	public static void main (String []args) {
		Banque maBanque = new Banque("maBanque");
		maBanque.ouvrir("AAA", 150.25f);
		maBanque.ouvrir("BBB", 100.47f);
		maBanque.ouvrir("CCC", 1500);
		maBanque.ouvrir("DDD", 3500.78f);
		maBanque.déposer("CCC", 300);
		maBanque.retirer("DDD", 4500.78f);
		if (maBanque.compteExiste("AAA")) {
			System.out.println("oui AAA existe ");
		}
		if (maBanque.compteExiste("EEE")) {
			System.out.println("oui EEE existe");
		}
		
		System.out.println(maBanque.getCompte("AAA").toString());
		System.out.println(maBanque.toString());
		System.out.println(maBanque.afficherDebiteurs());
	}
}
