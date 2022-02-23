
public class Multiplication extends Noeud {
	
	public Multiplication(Expression g, Expression d) {
		super(g,d);
	}
	
	public double résultat() {
		return this.getExprG().résultat() * this.getExprD().résultat();
	}
	
	public char getOpérateur() {
		return '*';
	}

}
