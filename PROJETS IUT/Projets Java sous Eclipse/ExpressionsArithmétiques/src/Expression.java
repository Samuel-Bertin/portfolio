
public abstract class Expression {
	
	public boolean equals(Expression e2) {
		return this.r�sultat() == e2.r�sultat();
	}
	
	public abstract double r�sultat();
}
