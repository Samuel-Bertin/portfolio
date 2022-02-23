
public class RationnelClass implements Rationnel {

	// D�finition du type
	private int num�rateur;
	private int d�nominateur;

	// Construction pas dans interface
	// unRationnel
	public RationnelClass(int n, int d) throws IllegalArgumentException {
		if (d == 0) {
			throw new IllegalArgumentException("D�nominateur nul");
		}
		this.num�rateur = n;
		this.d�nominateur = d;
	}

	// op�rations de consultation - TAD en entr�e unqiuement
	// num�rateur
	public int getNum�rateur() {
		return this.num�rateur;
	}

	// d�nonominateur
	public int getD�nominateur() {
		return this.d�nominateur;
	}

	// op�rations d'�valuation - TAD en entr�e et en sortie (retourne une nouvelle
	// instance du TAD)
	// somme
	public Rationnel somme(Rationnel r2) {
		Rationnel r3 = new RationnelClass(
				(this.num�rateur * r2.getD�nominateur() + r2.getNum�rateur() * this.d�nominateur),
				(this.d�nominateur * r2.getD�nominateur()));
		return r3;
	}

	// produit
	public Rationnel produit(Rationnel r2) {
		Rationnel rP = new RationnelClass((this.num�rateur * r2.getNum�rateur()),
				(this.d�nominateur * r2.getD�nominateur()));
		return rP;
	}

	// division
	public Rationnel division(Rationnel r2) {
		Rationnel rD = new RationnelClass((this.num�rateur * r2.getD�nominateur()),
				(this.d�nominateur * r2.getNum�rateur()));
		return rD;
	}

	// reduction
	public Rationnel r�duction() {

		int num = this.num�rateur, den = this.d�nominateur, pgcd = 0;
		for (int i = 1; i <= num && i <= den; i++) {
			if (num % i == 0 && den % i == 0)
				pgcd = i;
		}
		Rationnel r�duction = new RationnelClass((num / pgcd), (den / pgcd));
		return r�duction;
	}

	// op�rations de modification (modifie un object du type TAD en entr�e sans rien
	// retourner)

}
