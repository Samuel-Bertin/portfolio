
public class Oral extends Evaluation{
	
	private boolean presentiel;
	
	public Oral(String libelle, float coefficient, boolean presentiel) {
		super(libelle,coefficient);
		this.presentiel = presentiel;
	}
	
	public String toString() {
		String oral = super.toString() + " controle oral";
		if (presentiel) {
			oral += "presentiel";
		} else {
			oral += "distanciel";
		}
		return oral;
	}
}
