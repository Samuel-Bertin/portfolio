public interface Couleur {
	
	public abstract int getRouge();
	
	public abstract int getVert();
	
	public abstract int getBleu();
	
	public abstract int valeurRVB();
	
	public abstract void setRouge(int rouge) throws IllegalArgumentException;
	
	public abstract void setVert(int vert) throws IllegalArgumentException;
	
	public abstract void setBleu(int bleu) throws IllegalArgumentException;
    
	public abstract Couleur mélanger(Couleur c, float p) throws IllegalArgumentException;

}
