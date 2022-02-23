/**
 * 
 * @author Samuel BERTIN
 *
 */
public class CompteEpargne extends CompteBancaire {

	/**
	 * taux d'�pargne
	 */
	private float taux;
	
	/**
	 * Cr�e un compte �pargne
	 * @param n num�ro de compte
	 * @param t taux d'�pargne
	 * @throws IllegalArgumentException taux negatif
	 */
	public CompteEpargne(String n, float t) throws IllegalArgumentException {
		super(n);
		if (t<=0) {
			throw new IllegalArgumentException("taux negatif");
		}
		this.taux = t;
	}
	
	/**
	 * renvoi le taux de ce compte Epargne
	 * @return taux 
	 */
	public float getTaux() {
		return this.taux;
	}
	
	/**
	 * 
	 * @return interets g�n�r�s par le compte
	 */
	public float getInterets() {
		if (this.solde() > 0) {
			return this.solde()*this.taux;
		} else {
			return 0;
		}
	}
	
	/**
	 * sp�cifier de nouveaux interets
	 */
	public void setInterets() {
		this.d�poser(this.getInterets());
	}
	
	/**
	 * retourne sous forme de chaine de caractere le compte 
	 */
	@Override
	public String toString() {
		return super.toString()+"Taux = "+this.taux+"%";
	}
}
