
public class Soustraction extends Noeud {
	
	public Soustraction(Expression g, Expression d) {
		super(g,d);
	}
	
	public double résultat() {
		return this.getExprG().résultat() - this.getExprD().résultat();
	}
	
	public char getOpérateur() {
		return '-';
	}


}
