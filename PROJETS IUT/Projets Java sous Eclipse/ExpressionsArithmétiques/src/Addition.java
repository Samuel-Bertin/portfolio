
public class Addition extends Noeud {
	
	public Addition(Expression g, Expression d) {
		super(g,d);
	}
	
	public double résultat() {
		return this.getExprG().résultat() + this.getExprD().résultat();
	}
	
	public char getOpérateur() {
		return '+';
	}
}
