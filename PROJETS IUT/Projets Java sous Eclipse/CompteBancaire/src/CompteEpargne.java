/**
 * 
 * @author Samuel BERTIN
 *
 */
public class CompteEpargne extends CompteBancaire {

	/**
	 * taux d'épargne
	 */
	private float taux;
	
	/**
	 * Crée un compte épargne
	 * @param n numéro de compte
	 * @param t taux d'épargne
	 * @throws IllegalArgumentException
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
	 * @return interets générés par le compte
	 */
	public float getInterets() {
		if (this.solde() > 0) {
			return this.solde()*this.taux;
		} else {
			return 0;
		}
	}
	
	/**
	 * 
	 * @param t interets a ajouter
	 * @return nouveaux intérés générés par le compte
	 */
	public void setInterets() {
		this.déposer(this.getInterets());
	}
	
	/**
	 * retourne sous forme de chaine de caractere le compte 
	 */
	@Override
	public String toString() {
		return super.toString()+"Taux = "+this.taux+"%";
	}
}
