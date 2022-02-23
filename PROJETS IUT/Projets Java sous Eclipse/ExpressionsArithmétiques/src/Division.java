
public class Division extends Noeud {
	
	public Division(Expression g, Expression d) {
		super(g,d);
	}
	
	public double résultat() {
		return this.getExprG().résultat() / this.getExprD().résultat();
				
	}
	
	public char getOpérateur() {
		return '/';
	}
}
