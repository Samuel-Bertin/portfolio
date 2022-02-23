/**
 * 
 * @author Samuel BERTIN
 * @version 
 */
public class CompteBancaire extends Compte {
	
	/**
	 * num�ro du compte bancaire
	 */
	private String num�ro;
	
	/**
	 * Cr�e un compte bancaire vide
	 */
	public CompteBancaire(String n) {
		this.num�ro = n;
	}
	
	/**
	 * retourne le num�ro de compte bancaire
	 */
	public String getNum�ro() {
		return this.num�ro;
	}
	
	/**
	 * Cr�er une chaine de caract�res r�pr�sentant le compte bancaire
	 */
	@Override
	public String toString() {
		return "Num�ro : "+this.getNum�ro()+super.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((num�ro == null) ? 0 : num�ro.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof CompteBancaire))
			return false;
		CompteBancaire other = (CompteBancaire) obj;
		if (num�ro == null) {
			if (other.num�ro != null)
				return false;
		} else if (!num�ro.equals(other.num�ro))
			return false;
		return true;
	}
	
	
	/**
	 * v�rifie l'�galit� entre deux comptes bancaires
	 *//*
	@Override
	public boolean equals(Object c) {
		if (c == null) {
			return false;
		}
		if ( this == c) {
			return true;
		}
		if (!(c instanceof CompteBancaire)) {
			return false;
		} else {
			return (this.num�ro == ((CompteBancaire)c).getNum�ro());
		}
	}*/
}		
