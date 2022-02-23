public interface Tableau<T> {

	public abstract int taille();
	
	public abstract T getIème(int i) throws IllegalArgumentException;
	
	public abstract void setIème(int i, T e) throws IllegalArgumentException;
	
	/*
		(P1)		taille (unTableau (n)) = n
		(P2)		taille (setIème (tab, i, e)) = taille (tab)
		(P3)		ième (setIème (tab, i, e), j) = 
						si i = j alors e sinon getIème (tab, j)
	*/

}
