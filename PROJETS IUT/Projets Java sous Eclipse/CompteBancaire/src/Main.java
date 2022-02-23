
public class Main {

	public static void main(String []args) {
		
		Compte [] tabCompte = new Compte[5];
		Compte c1 = new Compte();
		tabCompte[0] = c1;
		Compte c2 = new Compte();
		tabCompte[1] = c2;
		Compte c3 = new CompteBancaire("1234");
		tabCompte[2] = c3;
		Compte c4 = new CompteBancaire("4567");
		tabCompte[3] = c4;
		Compte c5 = new CompteEpargne("8910",2.7f);
		tabCompte[4] = c5;
		
		String type;
		
		for ( Compte i  : tabCompte) {
			
			if (i instanceof CompteEpargne) {
				type = "Compte Epargne";
			} else {
				if (i instanceof CompteBancaire){
					type = "Compte Bancaire";
				} else {
					type =  "Compte";
				}
			} 
			System.out.println(type);
		}
	}
}
	

