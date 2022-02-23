
public abstract class Evaluation {

	private String libelle;
	private float coefficient;
	
	public Evaluation(String libelle, float coefficient) {
		this.libelle = libelle;
		this.coefficient = coefficient;
	}
	
	public float getCoefficient() {
		return this.coefficient;
	}
	
	public String getLibelle() {
		return this.libelle;
	}
	
	public String toString() {
		String eval = this.libelle+"        coeff "+this.coefficient;
		return eval;
	}
}
