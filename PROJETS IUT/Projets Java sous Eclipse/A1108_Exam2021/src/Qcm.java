
public class Qcm extends Evaluation {
	
	private int nbQuestions;
	
	public Qcm(String libelle, float coefficient, int nbQuestions) {
		super(libelle, coefficient);
		this.nbQuestions = nbQuestions;
	}
	
	public int getNombreQuestions() {
		return this.nbQuestions;
	}
	
	public String toString() {
		String qcm = super.toString() + " QCM";
		return qcm;
	}
}
