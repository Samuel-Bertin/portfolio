import java.util.List;
import java.util.ArrayList;

public class TableauArrayList<T> implements Tableau<T> {

	private List<T> éléments;
	
	public TableauArrayList(int n) throws IllegalArgumentException {
		if (n <= 0) {
			throw new IllegalArgumentException();
		}
		this.éléments = new ArrayList<T>();
		for (int i = 0; i < n; i++) {
			this.éléments.add(null);
		}
	}
	
	public int taille() {
		return this.éléments.size();
	}
	
	public T getIème(int i) throws IllegalArgumentException {
		if (i < 0 || i > this.taille() - 1) {
			throw new IllegalArgumentException();
		}
		return this.éléments.get(i);
	}
	
	public void setIème(int i, T e) throws IllegalArgumentException {
		if (i < 0 || i > this.taille() - 1) {
			throw new IllegalArgumentException();
		}
		this.éléments.set(i, e);
	}
	
}
