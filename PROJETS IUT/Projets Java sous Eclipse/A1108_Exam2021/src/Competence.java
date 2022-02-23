import java.util.*;

public class Competence extends Module {
	
	private List<Evaluation> evaluations;
	
	public Competence(String libelle, List<Evaluation> evaluations) {
		super(libelle);
		this.evaluations = evaluations;
	}
	
	public List<Evaluation> getEvaluations() {
		return this.evaluations;
	}
	
	public float moyenne(List<Float> notes) throws IllegalArgumentException {
		float sommeCoeff= 0;
		for (Evaluation e : evaluations) {
			sommeCoeff += e.getCoefficient();
		}
		if (sommeCoeff >= 1.1) {
			throw new IllegalArgumentException("Somme des coeffs différente de 1");
		}
		float sommeNotes = 0;
		int j =0;
		for (Float i : notes) {
			sommeNotes += i*this.evaluations.get(j).getCoefficient();
			j++;
		}
		return sommeNotes;
	}
	
	public int totalQuestionsQCM() {
		int total = 0;
		for (Evaluation e : evaluations) {
			if (e instanceof Qcm) {
				total += ((Qcm) e).getNombreQuestions();
			}
		}
		return total;
	}
}
