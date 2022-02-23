
public class Feuille extends Expression {

	private int val;
	
	public Feuille(int val) {
		this.val = val;
	}
	
	public double résultat() {
		return this.val;
	}
	
}
