import java.util.List;
import java.util.ArrayList;

public class TableauArrayList<T> implements Tableau<T> {

	private List<T> �l�ments;
	
	public TableauArrayList(int n) throws IllegalArgumentException {
		if (n <= 0) {
			throw new IllegalArgumentException();
		}
		this.�l�ments = new ArrayList<T>();
		for (int i = 0; i < n; i++) {
			this.�l�ments.add(null);
		}
	}
	
	public int taille() {
		return this.�l�ments.size();
	}
	
	public T getI�me(int i) throws IllegalArgumentException {
		if (i < 0 || i > this.taille() - 1) {
			throw new IllegalArgumentException();
		}
		return this.�l�ments.get(i);
	}
	
	public void setI�me(int i, T e) throws IllegalArgumentException {
		if (i < 0 || i > this.taille() - 1) {
			throw new IllegalArgumentException();
		}
		this.�l�ments.set(i, e);
	}
	
}
