
public abstract class Expression {
	
	public boolean equals(Expression e2) {
		return this.résultat() == e2.résultat();
	}
	
	public abstract double résultat();
}
