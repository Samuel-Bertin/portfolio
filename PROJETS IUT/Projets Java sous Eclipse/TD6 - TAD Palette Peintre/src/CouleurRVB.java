public class CouleurRVB implements Couleur {
	
	private int rouge;
	private int vert;
	private int bleu;
	
	public static final Couleur ROUGE = new CouleurRVB (255, 0, 0);
	public static final Couleur VERT = new CouleurRVB (0, 255, 0);
	public static final Couleur BLEU = new CouleurRVB (0, 0, 255);
	
	public CouleurRVB (int rouge, int vert, int bleu) throws IllegalArgumentException {
		this.setRouge(rouge);
		this.setVert(vert);
		this.setBleu(bleu);
	}
	
	public int getRouge() {
		return (this.rouge);
	}
	
	public int getVert() {
		return (this.vert);
	}
	
	public int getBleu() {
		return (this.bleu);
	}
	
	public int valeurRVB() {
		return this.rouge * 256 * 256 + this.vert * 256 + this.bleu;
	}
	
	public void setRouge(int rouge) throws IllegalArgumentException {
		if (rouge < 0 || rouge > 255)
			throw new IllegalArgumentException ("mauvaise nuance de rouge " + rouge);
		this.rouge = rouge;
	}
	
	public void setVert(int vert) throws IllegalArgumentException {
		if (vert < 0 || vert > 255)
			throw new IllegalArgumentException ("mauvaise nuance de vert " + vert);
		this.vert = vert;
	}
	
	public void setBleu(int bleu) throws IllegalArgumentException {
		if (bleu < 0 || bleu > 255)
			throw new IllegalArgumentException ("mauvaise nuance de bleu " + bleu);
		this.bleu = bleu;
	}
    
	public Couleur mélanger(Couleur c, float p) throws IllegalArgumentException {
		if (p < 0F || p > 1F)
			throw new IllegalArgumentException ("mauvais pourcentage" + p);
		int r = (int) (p*c.getRouge() + (1-p)*this.rouge);
		int v = (int) (p*c.getVert() + (1-p)*this.vert);
		int b = (int) (p*c.getBleu() + (1-p)*this.bleu);		
		return new CouleurRVB(r,v,b);
	}
	
	public String toString() {
		return ("(" + this.rouge + "," + this.vert + "," + this.bleu + ")");
	}
	
}
