/**
 * 
 * @author Samuel BERTIN
 * @version 1.0
 */
public class CompteBancaire extends Compte {
	
	/**
	 * num�ro du compte bancaire
	 */
	private String num�ro;
	
	/**
	 * cr�e un compte bancaire de num�ro n
	 * @param n num�ro de compte a ouvrir
	 */
	public CompteBancaire(String n) {
		this.num�ro = n;
	}
	
	/**
	 * 
	 * @return num�ro de compte
	 */
	public String getNum�ro() {
		return this.num�ro;
	}
	
	/**
	 *  cr�e une chaine de caractere respr�sentant un compte bancaire 
	 */
	@Override
	public String toString() {
		return "Num�ro : "+this.getNum�ro()+" "+super.toString();
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
