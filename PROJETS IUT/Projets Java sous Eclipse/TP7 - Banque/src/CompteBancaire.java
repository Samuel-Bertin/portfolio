/**
 * 
 * @author Samuel BERTIN
 * @version 1.0
 */
public class CompteBancaire extends Compte {
	
	/**
	 * numéro du compte bancaire
	 */
	private String numéro;
	
	/**
	 * crée un compte bancaire de numéro n
	 * @param n numéro de compte a ouvrir
	 */
	public CompteBancaire(String n) {
		this.numéro = n;
	}
	
	/**
	 * 
	 * @return numéro de compte
	 */
	public String getNuméro() {
		return this.numéro;
	}
	
	/**
	 *  crée une chaine de caractere resprésentant un compte bancaire 
	 */
	@Override
	public String toString() {
		return "Numéro : "+this.getNuméro()+" "+super.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numéro == null) ? 0 : numéro.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof CompteBancaire))
			return false;
		CompteBancaire other = (CompteBancaire) obj;
		if (numéro == null) {
			if (other.numéro != null)
				return false;
		} else if (!numéro.equals(other.numéro))
			return false;
		return true;
	}
	
	
	/**
	 * vérifie l'égalité entre deux comptes bancaires
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
			return (this.numéro == ((CompteBancaire)c).getNuméro());
		}
	}*/
}		
