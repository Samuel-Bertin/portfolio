
public class Ecrit extends Evaluation {
	
	public Ecrit(String libelle, float coefficient) {
		super(libelle, coefficient);
	}
	
	public String toString() {
		String ecrit = super.toString()+"   controle ecrit";
		return ecrit;
	}	
}
