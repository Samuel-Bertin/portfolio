public interface Tableau<T> {

	public abstract int taille();
	
	public abstract T getI�me(int i) throws IllegalArgumentException;
	
	public abstract void setI�me(int i, T e) throws IllegalArgumentException;
	
	/*
		(P1)		taille (unTableau (n)) = n
		(P2)		taille (setI�me (tab, i, e)) = taille (tab)
		(P3)		i�me (setI�me (tab, i, e), j) = 
						si i = j alors e sinon getI�me (tab, j)
	*/

}
