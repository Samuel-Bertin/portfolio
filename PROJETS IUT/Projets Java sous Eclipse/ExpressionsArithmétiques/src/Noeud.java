
public abstract class Noeud extends Expression {

	private Expression exprG;	
	private Expression exprD;
	
	public Noeud(Expression g, Expression d) {
		this.exprG = g;
		this.exprD = d;
	}
	
	public abstract char getOpérateur();
	
	public Expression getExprG() {
		return this.exprG;
	}
	
	public Expression getExprD() {
		return this.exprD;
	}
	
}
