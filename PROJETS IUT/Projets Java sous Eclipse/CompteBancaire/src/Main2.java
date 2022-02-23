import java.util.*;
public class Main2 {

public static void main(String []args) {
		
		List<Compte> listeCompte = new ArrayList<Compte>();
		Compte c1 = new Compte();
		listeCompte.add(c1);
		Compte c2 = new Compte();
		listeCompte.add(c2);
		Compte c3 = new CompteBancaire("1234");
		listeCompte.add(c3);
		Compte c4 = new CompteBancaire("4567");
		listeCompte.add(c4);
		Compte c5 = new CompteEpargne("8910",2.7f);
		listeCompte.add(c5);
		
		String type;
		
		for ( Compte i  : listeCompte) {
			
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
