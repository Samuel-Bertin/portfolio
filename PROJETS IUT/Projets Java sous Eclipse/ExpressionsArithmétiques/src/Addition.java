
public class Addition extends Noeud {
	
	public Addition(Expression g, Expression d) {
		super(g,d);
	}
	
	public double r�sultat() {
		return this.getExprG().r�sultat() + this.getExprD().r�sultat();
	}
	
	public char getOp�rateur() {
		return '+';
	}
}
