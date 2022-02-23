
public class RationnelClass implements Rationnel {

	// Définition du type
	private int numérateur;
	private int dénominateur;

	// Construction pas dans interface
	// unRationnel
	public RationnelClass(int n, int d) throws IllegalArgumentException {
		if (d == 0) {
			throw new IllegalArgumentException("Dénominateur nul");
		}
		this.numérateur = n;
		this.dénominateur = d;
	}

	// opérations de consultation - TAD en entrée unqiuement
	// numérateur
	public int getNumérateur() {
		return this.numérateur;
	}

	// dénonominateur
	public int getDénominateur() {
		return this.dénominateur;
	}

	// opérations d'évaluation - TAD en entrée et en sortie (retourne une nouvelle
	// instance du TAD)
	// somme
	public Rationnel somme(Rationnel r2) {
		Rationnel r3 = new RationnelClass(
				(this.numérateur * r2.getDénominateur() + r2.getNumérateur() * this.dénominateur),
				(this.dénominateur * r2.getDénominateur()));
		return r3;
	}

	// produit
	public Rationnel produit(Rationnel r2) {
		Rationnel rP = new RationnelClass((this.numérateur * r2.getNumérateur()),
				(this.dénominateur * r2.getDénominateur()));
		return rP;
	}

	// division
	public Rationnel division(Rationnel r2) {
		Rationnel rD = new RationnelClass((this.numérateur * r2.getDénominateur()),
				(this.dénominateur * r2.getNumérateur()));
		return rD;
	}

	// reduction
	public Rationnel réduction() {

		int num = this.numérateur, den = this.dénominateur, pgcd = 0;
		for (int i = 1; i <= num && i <= den; i++) {
			if (num % i == 0 && den % i == 0)
				pgcd = i;
		}
		Rationnel réduction = new RationnelClass((num / pgcd), (den / pgcd));
		return réduction;
	}

	// opérations de modification (modifie un object du type TAD en entrée sans rien
	// retourner)

}
