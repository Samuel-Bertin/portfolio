
public class Position extends java.lang.Object {

	private int ligne;
	private int colonne;
	
	public Position(int l, int c) {
		this.setLigne(l);
		this.setColonne(c);
	}

	public int getLigne() {
		return ligne;
	}

	public void setLigne(int ligne) {
		this.ligne = ligne;
	}

	public int getColonne() {
		return colonne;
	}

	public void setColonne(int colonne) {
		this.colonne = colonne;
	}
	
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (!(o instanceof Position)) {
			return false;
		} else { 
			return (this.colonne == ((Position) o).getColonne() && this.ligne == ((Position)o).getLigne() );		
		}
		
	}	
}
