
public class Lettre {
	
	private String origine;
	private String destination;
	private int codePostal;
	private int poids;
	private int volume;
	private int tauxReco;
	private boolean urgence;
	
	final double tarifDeBase = 0.5;
	final double tarifCaractereUrgence = 0.3;

	
	public Lettre(String origine, String destination, int codepostal , int poids , int volume, int taux, boolean urgence) {
		this.origine = origine;
		this.destination = destination;
		this.codePostal = codepostal;
		this.poids = poids;
		this.volume = volume;
		this.tauxReco = taux;
		this.urgence = urgence;
	}

	public double affranchir() {
		double taux = this.tarifDeBase;
		if (this.tauxReco == 1) {
			taux += this.tarifDeBase;
		} else if (this.tauxReco == 2){
			taux += (3*this.tarifDeBase);
		}
		if (urgence) {taux+=this.tarifCaractereUrgence;}
		return taux;
	}

	public double rembourser() {
		double taux = 0;
		if (this.tauxReco == 1 ) {
			taux = 1.5;
		}
		if (this.tauxReco == 2 ) {
			taux = 15;
		} return taux;
	}
	
	@Override
	public String toString() {
		return "Lettre["+this.codePostal+"/"+this.destination+"/"+this.tauxReco+"/"+caractèreUrgent();
	}
	
	public String caractèreUrgent() {
		if (this.urgence) {
			return "urgent]";
		} else { return "ordinaire]";}
	}
	
}
