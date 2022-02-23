
public class CompteurKilo {
		
	private Compteur[] compteurs;
	
	public CompteurKilo() {
		this.compteurs = new Compteur[3];
		for (int i = 0 ; i < 3 ; i++) {
			this.compteurs[i] = new Compteur();
		}
	}
	
	public  int toInteger() {
		return compteurs[0].getValeur()*100 + compteurs[1].getValeur()*10 + compteurs[2].getValeur();
	}

	public void ajouterUn() throws CompteurException {
		if (this.toInteger() == 999) {
			throw new CompteurException();
		}
		compteurs[2].ajouterUn();
		if (compteurs[2].getValeur() == 0) {
			compteurs[1].ajouterUn();
			if (compteurs[1].getValeur() == 0) {
				compteurs[0].ajouterUn();
			}
		}
	}

	public boolean isEqualsTo(CompteurKilo c) {
		if (this == c) {
			return true;
		} 
		return (this.toInteger() == c.toInteger());
	}
	
	public String toString() {
		return "Compteur Journalier: "+compteurs[0].getValeur()+" "+compteurs[1].getValeur()+" "+compteurs[2].getValeur()+" kms";
	}
	
}
